package home;

import home.DbManager.DbType;
import home.DbManager.ReportType;

public class Test {
    
    public static void main(String[] args){

        DbManager.generate_report(DbType.MYSQL, ReportType.PDF, "");
        DbManager.generate_report(DbType.MYSQL, ReportType.HTML, "");

        DbManager.generate_report(DbType.ORACLE, ReportType.PDF, "");
        DbManager.generate_report(DbType.ORACLE, ReportType.HTML, "");


    }
    
}
