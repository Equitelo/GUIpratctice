package guipractice;

import  java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame{
    
    NewWindow dragPanel = new NewWindow();
    JLabel label;
    
    MyFrame(){
        
        this.add(dragPanel);
        this.setTitle("Drag & Drop demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    
}
