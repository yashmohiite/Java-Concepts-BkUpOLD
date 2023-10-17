package com.ERP.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;

    public static Connection createConnection(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="12345";
            String url = "jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";

            con= DriverManager.getConnection(url,user,pass);

        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return con;
    }

}