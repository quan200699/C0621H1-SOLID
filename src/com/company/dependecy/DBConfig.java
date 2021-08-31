package com.company.dependecy;

public class DBConfig {
    private DBConnection dbConnection;

    public DBConfig(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void config(){
        dbConnection.connect();
    }
}
