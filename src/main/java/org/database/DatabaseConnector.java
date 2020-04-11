package org.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseConnector {

    public ArrayList<String> syllabefirstArrayList(String textJDBC, String name, String password) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(textJDBC, name, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT name FROM names_generator.fantasy_names_generator.syllabefirst");
            ArrayList<String> skabikyArrayList = new ArrayList<>();
            while (rs.next()) {
                skabikyArrayList.add(rs.getString(1));
            }
            con.close();

            return skabikyArrayList;

        } catch (Exception e) {
            System.out.println(e.toString());
            ArrayList<String> skabikyArrayList = new ArrayList<>();
            return skabikyArrayList;
        }
    }

    public ArrayList<String> syllabesecondArrayList(String textJDBC, String name, String password) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(textJDBC, name, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT name FROM names_generator.fantasy_names_generator.syllabesecond");
            ArrayList<String> skabikyArrayList = new ArrayList<>();
            while (rs.next()) {
                skabikyArrayList.add(rs.getString(1));
            }
            con.close();

            return skabikyArrayList;

        } catch (Exception e) {
            System.out.println(e.toString());
            ArrayList<String> skabikyArrayList = new ArrayList<>();
            return skabikyArrayList;
        }
    }

    public ArrayList<String> syllabelastArrayList(String textJDBC, String name, String password) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(textJDBC, name, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT name FROM fantasy_names_generator.syllabelast");
            ArrayList<String> skabikyArrayList = new ArrayList<>();
            while (rs.next()) {
                skabikyArrayList.add(rs.getString(1));
            }
            con.close();

            return skabikyArrayList;

        } catch (Exception e) {
            ArrayList<String> skabikyArrayList = new ArrayList<>();
            return skabikyArrayList;
        }
    }

    public void slabikyArrayListInsert(String textJDBC, String name, String password, String slabika) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(textJDBC, name, password);

            Statement stmt = con.createStatement();

            stmt.execute("INSERT INTO slabiky.first (slabika) VALUES ('" + slabika + "')");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
