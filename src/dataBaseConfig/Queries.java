package dataBaseConfig;

import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.util.ArrayList;

public class Queries {

    private final static Connection conn = DBConfig.getConnection();

    public static void insertBachelorInfo
            (String table, String std_id, String name, String NIC, String address, String gender, String email, String degree_id, String school_id, int year){
                String insert="insert into " + table + " (std_id, name, NIC, address, gender, email, degree_id, school_id, year) values (?,?,?,?,?,?,?,?,?)";
                try{
                    PreparedStatement stmt = conn.prepareStatement(insert);

                    stmt.setString(1,std_id);
                    stmt.setString(2,name);
                    stmt.setString(3,NIC);
                    stmt.setString(4,address);
                    stmt.setString(5,gender);
                    stmt.setString(6,email);
                    stmt.setString(7,degree_id);
                    stmt.setString(8,school_id);
                    stmt.setInt(9,year);

                    stmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
    }

    public static void insertMasterInfo
            (String table, String std_id, String name, String NIC, String address, String gender, String email, String degree_id, String school_id, int year, String qualification_type, String institute, int year_of_completion){
                String insert="insert into " + table + " (std_id, name, NIC, address, gender, email, degree_id, school_id, year, qualification_type, institute, year_of_completion) values (?,?,?,?,?,?,?,?,?,?,?,?)";
                try{
                    PreparedStatement stmt = conn.prepareStatement(insert);

                    stmt.setString(1,std_id);
                    stmt.setString(2,name);
                    stmt.setString(3,NIC);
                    stmt.setString(4,address);
                    stmt.setString(5,gender);
                    stmt.setString(6,email);
                    stmt.setString(7,degree_id);
                    stmt.setString(8,school_id);
                    stmt.setInt(9,year);
                    stmt.setString(10,qualification_type);
                    stmt.setString(11,institute);
                    stmt.setInt(12,year_of_completion);

                    stmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
    }

    public static void insertBachelorALResults(String std_id, String subject, String result){
        String insert="insert into bachelor_al_results (std_id, subject, result) values (?,?,?)";
        try{
            PreparedStatement stmt = conn.prepareStatement(insert);

            stmt.setString(1,std_id);
            stmt.setString(2,subject);
            stmt.setString(3,result);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int countStudents(String table){
        String count="select count(std_id) from "+ table;
        try{
            PreparedStatement stmt = conn.prepareStatement(count);
            ResultSet rs = stmt.executeQuery();
            int no_of_std=0;
            if(rs.next()){
                no_of_std = rs.getInt(1);
            }
            return no_of_std;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static ArrayList getSubjectIDS(String schoolID, String degreeID, String year){
        String subID="select sub_code from subjects where school_id=\""+schoolID+"\" and degree_id=\""+degreeID+"\" and year="+year;
        ArrayList<String> subList=new ArrayList<String>();
        try{
            Statement stmt = conn.createStatement();
            ResultSet set = stmt.executeQuery(subID);

            while(set.next()){
                subList.add(set.getString(1));
            }
            return subList;
        } catch (SQLException e) {
            e.printStackTrace();
            return subList;
        }
    }

    public static ArrayList getSubjectNames(String schoolID, String degreeID, String year){
        String subName="select name from subjects where school_id=\""+schoolID+"\" and degree_id=\""+degreeID+"\" and year="+year;
        ArrayList<String> subNameList=new ArrayList<String>();
        try{
            Statement stmt = conn.createStatement();
            ResultSet set = stmt.executeQuery(subName);

            while(set.next()){
                subNameList.add(set.getString(1));
            }
            return subNameList;
        } catch (SQLException e) {
            e.printStackTrace();
            return subNameList;
        }
    }

    public static void insertSelectedSubs(String std_id,String sub){
        String insert="insert into subject_selection (std_id,sub) values (?,?)";
        try{
            PreparedStatement stmt = conn.prepareStatement(insert);

            stmt.setString(1,std_id);
            stmt.setString(2,sub);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList getFees(String schoolID, String degreeID, String year){
        String subName="select fee from subjects where school_id=\""+schoolID+"\" and degree_id=\""+degreeID+"\" and year="+year;
        ArrayList<String> subFeeList=new ArrayList<String>();
        try{
            Statement stmt = conn.createStatement();
            ResultSet set = stmt.executeQuery(subName);

            while(set.next()){
                subFeeList.add(set.getString(1));
            }
            return subFeeList;
        } catch (SQLException e) {
            e.printStackTrace();
            return subFeeList;
        }
    }
}
