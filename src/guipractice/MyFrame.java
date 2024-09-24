/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guipractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class MyFrame extends JFrame implements ActionListener{
    
    JButton button;
    JLabel label;
    
    MyFrame(){
        
        ImageIcon icon = new ImageIcon("C:\\Documents\\NetBeansProjects\\GUIpractice\\src/logo.png.png");
        ImageIcon icon2 = new ImageIcon("C:\\Documents\\NetBeansProjects\\GUIpractice\\src/100.png");
        
        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);
        
        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("Im a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.blue);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500); // sets the x-dimension, and y-dimension of frame
        this.setVisible(true); //makes it visible
        this.add(button);
        this.add(label);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("poo");
            button.setEnabled(false); //click just once
            label.setVisible(true);
        }
    }
    
}
