package guipractice;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GUIpractice {

    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both
        
        ImageIcon image = new ImageIcon("C:\\Documents\\NetBeansProjects\\GUIpractice\\src/logo.png.png");
        //                                                        width
        Border border = BorderFactory.createLineBorder(Color.cyan, 3);
        
        JLabel label = new JLabel();
        label.setText("Bro, do you even code?"); //set text label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of image
        label.setVerticalTextPosition(JLabel.TOP);//set text TOP,CENTER BOTTOM, of image
        label.setForeground(Color.blue); //set font color of text
        label.setFont(new Font("Times New Roman",Font.PLAIN, 20)); //set font of text
        label.setIconTextGap(-15); //set gap of text to image
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //SET VERTICAL POSITION OF ICON+TEXT WITHIN LABEL
        label.setHorizontalAlignment(JLabel.CENTER); //SET HORIZONTAL POSITION OF ICON+TETX WITHIN LABEL
        //              x, y, width, height
        //label.setBounds(100, 100, 250, 250); // size of the label
        
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null); // for the size of the label
        frame.setSize(420,420); // sets the x-dimension, and y-dimension of frame
        frame.setVisible(true); //makes it visible
        frame.add(label);
        frame.pack(); //ad first all the components, and then the pack
    }
    
}
