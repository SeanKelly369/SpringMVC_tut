package com.demo.models;

import java.sql.ResultSet;
import java.sql.Statement;

public class Login_Model {

    public String do_login_process(String username, String password) {
        try {
            Database_Connectivity dc = new Database_Connectivity();
            System.out.println("dc is " + dc);
            Statement statement = dc.do_db_connection();
            System.out.println("statement is " + statement);

            ResultSet rs = statement.executeQuery("select count(*) from users where password='"+password+"' and username='"+username+"'");
            System.out.println(rs);
            int count = 0;
            while (rs.next()) {
                count = rs.getInt(1);
            }

            rs.close();

            if(count == 1) {
                return "login success";
            } else {
                return "Username OR password does not match";
            }

        } catch(Exception e) {

            return "Something went wrong.  Please try again";
        }
    }
}
