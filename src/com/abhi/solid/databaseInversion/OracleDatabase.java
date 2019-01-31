package com.abhi.solid.databaseInversion;

/**
 * Created by Abhinav on 12/6/2018.
 */
public class OracleDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to the Oracle Database....");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting to the Oracle Database....");
    }
}
