package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class Util {
    //protected final String jdbcDriver = "com.mysql.jdbc.Driver";
    protected static final String DB_URL = "jdbc:mysql://localhost:3306/first";
    protected static final String DB_USERNAME = "root";
    protected static final String DB_PASSWORD = "root";
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connection ok \n");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection error \n");
        }
        return connection;
    }
}
