/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guipractice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class MyFrame extends JFrame implements ActionListener{
    
    JButton button;
    
    MyFrame(){
        
        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500); // sets the x-dimension, and y-dimension of frame
        this.setVisible(true); //makes it visible
        this.add(button);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("poo");
        }
    }
    
}
