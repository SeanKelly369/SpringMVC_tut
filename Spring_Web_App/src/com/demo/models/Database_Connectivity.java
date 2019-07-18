package com.demo.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database_Connectivity {
    Connection conn;
    Statement statement;

    String url = "jdbc:postgresql://localhost:5432/";
    String db_name = "";
    String username = "";
    String password = "";

    public Statement do_db_connection() {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url+db_name , username , password);
            statement = conn.createStatement();
            System.out.println("Connected");
            return statement;
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
            return null;
        }
    }
}

