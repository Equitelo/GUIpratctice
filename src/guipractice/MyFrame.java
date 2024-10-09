package guipractice;

import  java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{
    
    JLabel label;
    ImageIcon icon;
    
    MyFrame(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true); //for the background to show
        //this.addMouseListener(this); this line would be applied to the label, but when entered to the whole frame
        label.addMouseListener(this);
        
        this.add(label);
        this.setVisible(true);
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        //Invoke when the mouse button has been clicked (pressed and released) on a component
        System.out.println("You clicked the mouse");
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        //Invoked when a mouse button has been pressed on a component
        System.out.println("You pressed the mouse");
        label.setBackground(Color.yellow);
    }
    
    @Override
    public void mouseReleased(MouseEvent e){
        //Invoked when a mouse button has been released on a component
        System.out.println("You released the mouse");
        label.setBackground(Color.green);
    }
    
    @Override
    public void mouseEntered(MouseEvent e){
        //Invoked when the mouse enters a component
        System.out.println("You entered the component");
        label.setBackground(Color.blue);
    }
    
    @Override
    public void mouseExited(MouseEvent e){
        //Invoked when the mouse exits a component
        System.out.println("Yout exited the component");
        label.setBackground(Color.red);
    }
}
