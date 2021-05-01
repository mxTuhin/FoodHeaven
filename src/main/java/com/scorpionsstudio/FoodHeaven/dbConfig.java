package com.scorpionsstudio.FoodHeaven;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class dbConfig {
    public static Connection db(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/tuhinmri_foodheaven?", "root", "");

        }
        catch (Exception e){
            System.out.println("Meep");
        }
        return con;
    }


}
