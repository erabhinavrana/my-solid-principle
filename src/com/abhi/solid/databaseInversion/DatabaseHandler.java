package com.abhi.solid.databaseInversion;

/**
 * Created by Abhinav on 12/6/2018.
 */
public class DatabaseHandler {

    private Database database;

    public DatabaseHandler(Database database) {
        this.database = database;
    }

    public void connect(){
        this.database.connect();
    }

    public void disconnect(){
        this.database.disconnect();
    }
}
