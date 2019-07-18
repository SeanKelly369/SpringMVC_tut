package com.demo.models;

import java.sql.Statement;

public class Signup_Model {

    public String doSignUp(String username, String password, String gender, String vehicle, String country, String image) {
        try {
            Database_Connectivity dc = new Database_Connectivity();
            Statement statement = dc.do_db_connection();

            statement.execute("insert into users values ('"+username+"' , '"+password+"' , '"+gender+"' , '"+vehicle+"' , '"+country+"' , '"+image+"')");
            return "Signed up successfully";
        } catch(Exception e) {
            System.out.println(e);
            return "Something went wrong, please try again";
        }
    }
}
