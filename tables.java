/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class tables {
    public static void main (String [] args)
    {
        try
        {
            String userTable="create table user (id int Auto_INCREMENT primary key, name varchar(250),email varchar(250), phoneNumber varchar(11), address varchar(250), password varchar(250), securityQuestion varchar(250), answer varchar(250), status varchar(20), UNIQUE (email))";
            String adminDetails= "insert into user(name,email,phoneNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','Dhaka','admin','What is 1+1?','2','true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar (200))";
            String productTable="create table product(id int AUTO_INCREMENT primary key, name varchar(200),category varchar(200), price varchar(200))";
            String billTable = "create table bill(id int primary key,name varchar (200),phoneNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";

           // DbOperations.setDataOrDelete(userTable,"User Table Created Successfully");
            //Adding admin details from here; writing the admin details here because ek system theke arek system shift korle jodiadmin register korte mone na thake or directly signup bar diyei korte parbo
           // DbOperations.setDataOrDelete(adminDetails,"Admin created successfully");            
            //DbOperations.setDataOrDelete(categoryTable,"Category Table created successfully");
            //DbOperations.setDataOrDelete(productTable,"Product Table created successfully");
           //DbOperations.setDataOrDelete(billTable,"Bill Table created successfully");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
/*sample accounts:
email= messi@gmail.com
password: messi
answer: Christiano Ronaldo
admin account:
email:admin@gmail.com
password:admin
answer:2
*/