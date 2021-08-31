package com.company.dependecy;

public class SQLServerConnection implements DBConnection{
    @Override
    public void connect() {
        System.out.println("Kết nối đến SQL Server");
    }
}
