package guipractice;

import  java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{
    
    JLabel label;
    ImageIcon peace;
    ImageIcon curious;
    ImageIcon stop;
    ImageIcon wow;
    
    MyFrame(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        
        label = new JLabel();
        label.addMouseListener(this);
        
        peace = new ImageIcon("src/peace.png");
        curious = new ImageIcon("src/hmm.png");
        stop = new ImageIcon("src/stop.png");
        wow = new ImageIcon("src/wow.png");
        
        label.setIcon(peace);
        
        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        //Invoke when the mouse button has been clicked (pressed and released) on a component
        
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        //Invoked when a mouse button has been pressed on a component
        label.setIcon(stop);
    }
    
    @Override
    public void mouseReleased(MouseEvent e){
        //Invoked when a mouse button has been released on a component
        label.setIcon(wow);
    }
    
    @Override
    public void mouseEntered(MouseEvent e){
        //Invoked when the mouse enters a component
        label.setIcon(curious);
    }
    
    @Override
    public void mouseExited(MouseEvent e){
        //Invoked when the mouse exits a component
        label.setIcon(peace);
    }
}
