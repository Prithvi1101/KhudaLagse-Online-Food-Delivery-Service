/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import model.Bill;
/**
 *
 * @author User
 */
public class BillDao {
    public static int totalRevenue = 0;
    public static String getId(){
        int id=1;
        try{
            ResultSet rs= DbOperations.getData("select max(id) from bill");
            if(rs.next())
            {
                id=rs.getInt(1);
                id=id+1;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    
    public static void save(Bill bill)
    {
        String query = "insert into bill values('"+bill.getId()+"','"+bill.getName()+"','"+bill.getPhoneNumber()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.getCreatedBy()+"')";
        DbOperations.setDataOrDelete(query,"Bill Details Added Successfully");
    }
    
    //to print in order history
    public static ArrayList<Bill> getAllRecordsByAsc(String date)
    {
        ArrayList<Bill> arrayList = new ArrayList<>();
       try
       {
           ResultSet rs= DbOperations.getData("select * from bill order by date asc");
           while(rs.next())
           {
           Bill bill= new Bill();
           bill.setId(rs.getInt("id"));
           bill.setName(rs.getString("name"));
           bill.setPhoneNumber(rs.getString("phoneNumber"));
           bill.setEmail(rs.getString("email"));
           bill.setDate(rs.getString("date"));
           bill.setTotal(rs.getString("total"));
           bill.setCreatedBy(rs.getString("createdBy"));
           arrayList.add(bill);
           }
           
       } 
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
        return arrayList;
    }
    
    public static ArrayList<Bill> getAllRecordsByDesc(String date)
    {
        ArrayList<Bill> arrayList = new ArrayList<>();
       try
       {
           ResultSet rs= DbOperations.getData("select * from bill order by date desc");
           while(rs.next())
           {
           Bill bill= new Bill();
           bill.setId(rs.getInt("id"));
           bill.setName(rs.getString("name"));
           bill.setPhoneNumber(rs.getString("phoneNumber"));
           bill.setEmail(rs.getString("email"));
           bill.setDate(rs.getString("date"));
           bill.setTotal(rs.getString("total"));
           bill.setCreatedBy(rs.getString("createdBy"));
           arrayList.add(bill);
           }
           
       } 
       catch(Exception e)
       {
           JOptionPane.showConfirmDialog(null,e);
       }
        return arrayList;
    }
        public static ArrayList<Bill> getAllRecords(){
        ArrayList<Bill> arrayList= new ArrayList<>();
        try{
            ResultSet rs= DbOperations.getData("Select * from bill");
            while(rs.next())
            {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setPhoneNumber(rs.getString("phoneNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
        
     public static int getTotalRevenue() {
        int totalRevenue = 0; // Initialize the total revenue variable

    try {
        ResultSet rs = DbOperations.getData("SELECT SUM(total) AS total_revenue FROM bill;");
        
        if (rs.next()) {
            totalRevenue = rs.getInt("total_revenue"); // Retrieve the integer value from the ResultSet
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return totalRevenue;
}    
         public static ArrayList<Bill> getAllRecordsbyEmail(String email){
        ArrayList<Bill> arrayList= new ArrayList<>();
        try{
            ResultSet rs= DbOperations.getData("select * from bill where email='"+email+"'");
            while(rs.next())
            {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setPhoneNumber(rs.getString("phoneNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
          public static ArrayList<Bill> getAllRecordsbyName(String name){
        ArrayList<Bill> arrayList= new ArrayList<>();
        try{
            ResultSet rs= DbOperations.getData("select * from bill where name like'%"+name+"%'");
            while(rs.next())
            {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setPhoneNumber(rs.getString("phoneNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
