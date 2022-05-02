package home;

public class DbManager {
    public static enum DbType{
        MYSQL,ORACLE;
    }
    public static enum ReportType{
        HTML,PDF;
    }
    public static void generate_report(DbType type_of_db,ReportType type_of_report,String table_name){
        switch(type_of_db){
            case MYSQL:SqlAssistant.getSqlDbConnection();

                    switch(type_of_report){
                        case HTML:SqlAssistant.generateHtmlReport("", "");
                                    break;
                    
                        case PDF:SqlAssistant.generatePDfReport("", "");
                                    break;            
                        } 
                break;

            case ORACLE:OracleAssistant.getOracleDbConnection();
                        switch(type_of_report){
                            case HTML:OracleAssistant.generateHtmlReport("", "");
                            break;

                            case PDF:OracleAssistant.generatePDfReport(table_name, "");
                            break;
                        }

                        break;
        }   
    }
}
