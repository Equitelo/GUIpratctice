/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guipractice;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class MyFrame extends JFrame{
    
    MyFrame(){
        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420); // sets the x-dimension, and y-dimension of frame
        this.setVisible(true); //makes it visible
        
        ImageIcon image = new ImageIcon("pfp-man.jpg"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(123,50,250));
        
    }
    
}
