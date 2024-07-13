/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlinefooddelivery.service;

/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author User
 */
public class OnlineFoodDeliveryService extends JFrame implements ActionListener{
    OnlineFoodDeliveryService()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(1366,565); //Association
        setBounds(300,300,1366,565);
       // setLocation(100,100); //To open the frame in middle
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/Home page photo first.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1366,565); //location x, location y, length, breadth
        add(image);//to add component in a frame  
       
        JLabel text= new JLabel("Food Delivery Service"); // to write on frame
        text.setBounds(10, 430,1000, 90);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("serif", Font.PLAIN,40));
        image.add(text);
        
        JButton next = new JButton("Next");
        next.setBounds(1150, 450, 150, 50);
        next.setBackground(Color.PINK);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        next.setFont(new Font("serif",Font.PLAIN,24));
        image.add(next);
        
        
        setVisible(true);
        
        while(true)
        {
            text.setVisible(false);
           
            try{
                Thread.sleep(500);
              
            }
            catch(Exception e)
            {
                System.out.println(e);
                e.printStackTrace();
            }
            text.setVisible(true);  //To make the frame visible or else dekha jabe na
              try{
                Thread.sleep(500);
           
            }
            catch(Exception e)
            {
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        OnlineFoodDeliveryService o1= new OnlineFoodDeliveryService();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       setVisible(false);
        Signup signup = new Signup();
        signup.setVisible(true);
    }
    
}
