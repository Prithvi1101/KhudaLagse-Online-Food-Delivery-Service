/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserDao {
    public static void save(User user)
    {
        String query= "insert into user(name, email, phoneNumber, address, password, securityQuestion, answer,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getPhoneNumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityQuestion()+"','"+user.getAnswer()+"','false')";
        DbOperations.setDataOrDelete(query, "Thank you for registering! Please wait for admin approval.");
    }
    
    public static User login(String email, String password)
    {
        User user= null;
        try
        {
            ResultSet rs=DbOperations.getData("select * from user where email='"+email+"' and password='"+password+"'");
            while(rs.next())
            {
                 user= new User();
                 user.setStatus(rs.getString("status")); //Return korbe if user exists or will show error
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    //ForgotPassword
    public static User getSecurityQuestion(String email)
    {
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("select * from user where email = '" + email + "'");
            while(rs.next())
            {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    
    public static void update(String email, String newPassword)
    {
        String query ="update user set password = '"+newPassword+"'where email='"+email+"'";
        DbOperations.setDataOrDelete(query,"Password Changed Successfully");
    }
    
    public static ArrayList<User> getAllrecords(String email)
    {
        ArrayList<User> arrayList = new ArrayList<>();
        try
        {
            ResultSet rs= DbOperations.getData("select * from user where email like '%"+email+"%'");
            while(rs.next())
            {
                User user= new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPhoneNumber(rs.getString("phoneNumber"));
                user.setAddress(rs.getString("address"));
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void changeStatus(String email,String status)
    {
        String query= "update user set status='"+status+"' where email= '"+email+"'";
        DbOperations.setDataOrDelete(query,"Status Changed Successfully");
    }
    
    //changePassword
    
    public static void changePassword(String email, String oldPassword, String newPassword)
    {
        try{
            ResultSet rs= DbOperations.getData("select * from user where email='"+email+"' and password='"+oldPassword+"'");
            if(rs.next())
            {
                update(email,newPassword);            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Current Password is incorrect. Please try again, Thank you!");
        }
    }
}
    
    
 