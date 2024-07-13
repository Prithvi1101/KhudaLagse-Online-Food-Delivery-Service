/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinefooddelivery.service;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.nio.file.Files;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FoodImage {
    public static String foodName;
    FoodImage(String foodName)
    {
        this.foodName=foodName;
        //JFrame f = new JFrame();
       // f.setTitle(""+foodName);
      //  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  f.setBounds(100,100,20,20);
       // Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
      //  f.setUndecorated(true);
        
      try{
        ImageIcon image= new ImageIcon(ClassLoader.getSystemResource("icons/"+foodName+".jpg"));
        JOptionPane.showInternalMessageDialog(null,"", foodName, JFrame.EXIT_ON_CLOSE, image);
      }
      catch(Exception e)
      {
        System.out.println(e);
        ImageIcon image1= new ImageIcon(ClassLoader.getSystemResource("icons/"+foodName+".jpeg"));
        JOptionPane.showInternalMessageDialog(null,"", foodName, JFrame.EXIT_ON_CLOSE, image1);


      }

        
       // JLabel lbl= new JLabel(image);
       // f.getContentPane().add(lbl);
       // f.setSize((image.getIconWidth()),(image.getIconHeight()));
       // int x=(screenSize.width-f.getSize().width)/2;
       // int y =(screenSize.height-f.getSize().width)/2;
       // f.setLocation(x,y);
       // f.setLayout(null);
       // f.setVisible(true);

        
    }
    public static void main(String[] args) {
        //System.out.println(foodName);
    }
 
}
