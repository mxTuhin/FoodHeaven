package com.scorpionsstudio.FoodHeaven;

import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionBlock extends HttpServlet {
    public Connection con = dbConfig.db();
    public Statement st ;
    public ResultSet rs;
    public PreparedStatement ps;

}
