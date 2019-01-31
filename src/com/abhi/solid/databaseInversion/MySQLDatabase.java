package com.abhi.solid.databaseInversion;

/**
 * Created by Abhinav on 12/6/2018.
 */
public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to the MySQL Database.....");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting to the MySQL Database.....");
    }
}
