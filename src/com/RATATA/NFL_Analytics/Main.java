package com.RATATA.NFL_Analytics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
//import com.mysql.jdbc.Driver;

public class Main {
    public static void main(String[] args) {

        // Test implementations

        // Test variables
        Owner bisciotti = new Owner("Steve", "Bisciotti");
        Franchise ravens = new Franchise("Ravens", bisciotti);
        Player p1 = new Player("Lamar", "Jackson", Player.QUARTERBACK, 8);

        // Testing classes
        ravens.playerRoster.add(p1);
        ravens.printRoster();

        // Testing SQL DB_Connection
        Connection conn = null;
        try {
            conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql/NFL_StatAnalysis?" +
                    "user=admin&password=$Wimr123");}

        catch (SQLException sqlE) {
            sqlE.printStackTrace();
        }

        // Testing SQL
        Statement testStatement = null; // necessary
        ResultSet resultSet = null; // necesary

        try {
            resultSet = testStatement.executeQuery("SELECT * FROM franchise INNER JOIN fOwner AS own  ON franchise.franchise_id WHERE own.owner_last_name like 'Bisciotti';");
            System.out.println(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}