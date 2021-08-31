package com.company.dependecy;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = new MySQLConnection();
        DBConfig dbConfg = new DBConfig(dbConnection);
        dbConfg.config();
        dbConnection = new SQLServerConnection();
        dbConfg = new DBConfig(dbConnection);
        dbConfg.config();
    }
}
