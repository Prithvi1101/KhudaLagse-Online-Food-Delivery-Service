/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package onlinefooddelivery.service;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author User
 */
public class ImageSlideShow extends JFrame {
    JLabel pic;
    Timer tm;
    int x = 0;
    //Images Path In Array
    String[] list = {
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Alfredo.jpg",//0
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Bashmati.jpeg",//1
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Beef Burger.jpg",//2
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Beef Steak.jpg",//3
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Cashew Nut.jpg",//4
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Chicken Biriyani.jpeg",//5
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Chicken Corn.jpeg",//6
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Chicken.jpg",//7
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Chocolate Cake.jpg",//8
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Chocolate Cold Coffee.jpeg",//9
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/CocaCola.jpg",//10
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Fanta.jpeg",//11
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Fried.jpeg",//12
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Kacchi.jpg",//13
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Margarita.jpeg",//14
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Pepperoni.jpg",//15
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Pudding.jpeg",//16
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Thai.jpg",//17
                      "H:/New Folder (3)/OnlineFoodDelivery Service/src/icons/Tomahawk.jpeg",//18
                    };
    
    public ImageSlideShow(){
        super("FOOD ITEMS");
        pic = new JLabel();
        pic.setBounds(40, 30, 900, 700);

        //Call The Function SetImageSize
        SetImageSize(6);
               //set a timer
        tm = new Timer(1000,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }
        });
        add(pic);
        tm.start();
        setLayout(null);
        setSize(1000, 800);
        getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        
        setVisible(true);
    }
    //create a function to resize the image 
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }

public static void main(String[] args){ 
      
    new ImageSlideShow();
}
}


