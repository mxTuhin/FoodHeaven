package com.scorpionsstudio.FoodHeaven;

import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionBlock extends HttpServlet {
    Connection con = dbConfig.db();
    Statement st ;
    ResultSet rs;
    PreparedStatement ps;

}
