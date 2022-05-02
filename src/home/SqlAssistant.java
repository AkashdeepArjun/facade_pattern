package home;
public class SqlAssistant{


    public static void getSqlDbConnection(){
        MyUtils.log("MYSQL CONNECTION","connection initialized");
     }
 
     public static  void generatePDfReport(String table_name,String connection){
        MyUtils.log("MYSQL DB GENERATE PDF REPORT","pdf being generated...");
 
     }
 
     public static  void generateHtmlReport(String table_name,String connection){
         MyUtils.log("MYSQL DB GENERATE HTML REPORT","html being generated...");
     }

}