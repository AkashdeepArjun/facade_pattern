package home;

public class OracleAssistant {
    
    public static void getOracleDbConnection(){
       MyUtils.log("ORACLE DB CONNECTION","connection initialized");
    }

    public static void generatePDfReport(String table_name,String connection){
       MyUtils.log("ORACLE DB GENERATE PDF REPORT","pdf being generated...");

    }

    public static void generateHtmlReport(String table_name,String connection){
        MyUtils.log("ORACLE DB GENERATE HTML REPORT","html being generated...");
    }

}
