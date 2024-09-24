package guipractice;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUIpractice {

    public static void main(String[] args) {
        // JFrame = a Gui window to add components to
        
//        JFrame frame = new JFrame(); //creates a frame
//        frame.setTitle("JFrame title goes here");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//        frame.setSize(420,420); // sets the x-dimension, and y-dimension of frame
//        frame.setVisible(true); //makes it visible
//        
//        ImageIcon image = new ImageIcon("pfp-man.jpg"); //create an ImageIcon
//        frame.setIconImage(image.getImage()); //change icon of frame
//        frame.getContentPane().setBackground(new Color(123,50,250)); // change color of background
        new MyFrame();
    }
    
}
