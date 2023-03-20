package com.Morgan;
import java.sql.*;

public class MySQLConnection {
    public static void main(String[] args) {
//        Connection conn = null;
//        try {
//            String url = "jdbc:mysql://localhost:3306/database";
//            String username = "root";
//            String password = "";
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection(url, username, password);
//            System.out.println("Connection established");
//        } catch (SQLException e) {
//            System.err.println("SQL Exception: " + e.getMessage());
//        } catch (ClassNotFoundException e) {
//            System.err.println("ClassNotFoundException: " + e.getMessage());
//        } finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                    System.out.println("Connection closed");
//                }
//            } catch (SQLException e) {
//                System.err.println("SQLException: " + e.getMessage());
//            }
//        }

        try{

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","jiban");
            System.out.println(conn);

        } catch (Exception e){
            System.out.println("Not Connected...");


        }

    }
}

