package dataBaseConfig;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {

    static String db = "nsbm";
    static String uname = "root";
    static String pswrd ="";

    public static Connection getConnection(){

        final String DRIVER = "com.mysql.jdbc.Driver";
        final String LOCATION_DB = "jdbc:mysql://localhost:3306/"+db;

        String userName = uname;
        String password = pswrd;
        Connection connect;

        try {
            Class.forName(DRIVER);
            connect = DriverManager.getConnection(LOCATION_DB,userName,password);
            System.out.println("Tadd !");
            return connect;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection failure");
            System.out.println("Tadd !!");

        }
        return null;
    }

}