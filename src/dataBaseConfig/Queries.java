package dataBaseConfig;

import receptionist.VarReceptionist;
import student.Result;

import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.util.ArrayList;

public class Queries {

    private final static Connection conn = DBConfig.getConnection();

    public static void insertBachelorInfo
            (String table, String std_id, String name, String NIC, String address, String tp, String gender, String email, String degree_id, String school_id, String year){
                String insert="insert into " + table + " (std_id, name, NIC, address, tp, gender, email, degree_id, school_id, year) values (?,?,?,?,?,?,?,?,?,?)";
                try{
                    PreparedStatement stmt = conn.prepareStatement(insert);

                    stmt.setString(1,std_id);
                    stmt.setString(2,name);
                    stmt.setString(3,NIC);
                    stmt.setString(4,address);
                    stmt.setString(5,tp);
                    stmt.setString(6,gender);
                    stmt.setString(7,email);
                    stmt.setString(8,degree_id);
                    stmt.setString(9,school_id);
                    stmt.setString(10,year);

                    stmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
    }

    public static void insertMasterInfo
            (String table, String std_id, String name, String NIC, String address, String tp, String gender, String email, String degree_id, String school_id, String year, String qualification_type, String institute, String year_of_completion){
                String insert="insert into " + table + " (std_id, name, NIC, address, tp, gender, email, degree_id, school_id, year, qualification_type, institute, year_of_completion) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                try{
                    PreparedStatement stmt = conn.prepareStatement(insert);

                    stmt.setString(1,std_id);
                    stmt.setString(2,name);
                    stmt.setString(3,NIC);
                    stmt.setString(4,address);
                    stmt.setString(5,tp);
                    stmt.setString(6,gender);
                    stmt.setString(7,email);
                    stmt.setString(8,degree_id);
                    stmt.setString(9,school_id);
                    stmt.setString(10,year);
                    stmt.setString(11,qualification_type);
                    stmt.setString(12,institute);
                    stmt.setString(13,year_of_completion);

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


    public static ArrayList getFees(){
        ArrayList<String> subFeeList=new ArrayList<String>();
        try{
            Statement stmt = conn.createStatement();
            for(int i =0;i<VarReceptionist.subSelection.length;i++){
                String subFee="select fee from subjects where sub_code="+VarReceptionist.subSelection[i].split(" ")[0];
                ResultSet set = stmt.executeQuery(subFee);
                if(set.next()){
                    subFeeList.add(String.valueOf(set.getInt(1)));
                }
            }
            return subFeeList;
        } catch (SQLException e) {
            System.out.println("Error");
            return subFeeList;
        }
    }


    public static ArrayList getSubjectLecturers(String subCode){
        String lecIDs="select lec_id from lecturer_subjects where sub_code="+subCode;
        ArrayList<String> lecs=new ArrayList<>();
        ArrayList<String> lecName = new ArrayList<>();
        try{
            Statement stmt = conn.createStatement();
            ResultSet set = stmt.executeQuery(lecIDs);

            while(set.next()){
                lecs.add(set.getString(1));
            }

            for(int i=0;i<lecs.size();i++){
                String lecNames = "select name from lecturers where lec_id ="+lecs.get(i);
                ResultSet set2 = stmt.executeQuery(lecNames);
                if(set2.next()){
                    lecName.add(set2.getString(1));
                }
            }
            return lecName;
        } catch(SQLException e){
            e.printStackTrace();
            return lecName;
        }
    }


    public static ArrayList getSubjectInstructors(String subCode){
        String inIDs="select ins_id from instructor_subjects where sub_code="+subCode;
        ArrayList<String> ins=new ArrayList<>();
        ArrayList<String> inName = new ArrayList<>();
        try{
            Statement stmt = conn.createStatement();
            ResultSet set = stmt.executeQuery(inIDs);

            while(set.next()){
                ins.add(set.getString(1));
            }

            for(int i=0;i<ins.size();i++){
                String lecNames = "select name from instructors where ins_id ="+ins.get(i);
                ResultSet set2 = stmt.executeQuery(lecNames);
                if(set2.next()){
                    inName.add(set2.getString(1));
                }
            }
            return inName;
        } catch(SQLException e){
            e.printStackTrace();
            return inName;
        }
    }

    public static int getFee(){
        int theFee=0;
        try{
            Statement stmt = conn.createStatement();
            String subFee="select fee from subjects where sub_code="+VarReceptionist.selectedSubID;
            ResultSet set = stmt.executeQuery(subFee);
            if(set.next()){
                theFee = set.getInt(1);
            }
            return theFee;
        } catch(SQLException e) {
            e.printStackTrace();
            return theFee;
        }
    }


    public static ArrayList<String> getBachelorInfo(String ID, String table){
        System.out.println(table);
        String batInfoQuery = "select * from " + table + " where std_id = " + ID;
        ArrayList<String> batInfo=new ArrayList<>();
        try{
            Statement stmt = conn.createStatement();
            ResultSet set = stmt.executeQuery(batInfoQuery);

            while(set.next()){
                batInfo.add(set.getString(1));
            }
            return batInfo;
        }catch(SQLException e){
            e.printStackTrace();
            return batInfo;
        }
    }

    public static ArrayList getSubjectIDSWithSem(String schoolID, String degreeID, String year, String sem){
        String subID="select sub_code from subjects where school_id=\""+schoolID+"\" and degree_id=\""+degreeID+"\" and year=\""+year+"\"and sem="+sem;
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

    public static ArrayList getSubjectNamesWithSem(String schoolID, String degreeID, String year, String sem){
        String subName="select name from subjects where school_id=\""+schoolID+"\" and degree_id=\""+degreeID+"\" and year=\""+year+"\"and sem="+sem;
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

    public static ArrayList getIDs(String table){
        String ids = "select std_id from " + table;
        ArrayList<String> IDs = new ArrayList<>();
        try{
            Statement stmt = conn.createStatement();
            ResultSet set = stmt.executeQuery(ids);

            while(set.next()){
                IDs.add(set.getString(1));
            }
            return IDs;
        }catch(SQLException e){
            e.printStackTrace();
            return IDs;
        }
    }

    public static void insertResults(String table, String std_id, String year, String semester, String degree_type, String school_id, String sub_code, String result){
        String insert = "insert into "+ table + " (std_id, year, semester, degree_type, school_id, sub_code, result) values (?,?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = conn.prepareStatement(insert);

            stmt.setString(1,std_id);
            stmt.setString(2,year);
            stmt.setString(3,semester);
            stmt.setString(4,degree_type);
            stmt.setString(5,school_id);
            stmt.setString(6,sub_code);
            stmt.setString(7,result);

            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static String getResults(String table, String std_id, String year, String semester, String degree_type, String school_id, String sub_code){
        String getRes = "select result from "+table+" where std_id ="+std_id+" and year = "+year+" and semester "+ semester+" and degree_type = "+degree_type+" and school_id= "+school_id+" and sub_code = "+ sub_code;
        String res="";
        try{
            Statement stmt = conn.createStatement();
            ResultSet set = stmt.executeQuery(getRes);

            while(set.next()){
                res=set.getString(1);
            }
            return res;
        }catch(SQLException e){
            e.printStackTrace();
            return res;
        }
    }
}

