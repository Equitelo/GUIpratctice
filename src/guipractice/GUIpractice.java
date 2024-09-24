package guipractice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GUIpractice {

    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("C:\\Documents\\NetBeansProjects\\GUIpractice\\src/logo.png.png");
        
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0, 0, 75, 75); //it controls label not to go literally at the top of all or at the right of all
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds( 250, 0, 250, 250);
        bluePanel.setLayout(new BorderLayout());
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // for the size of the label
        frame.setSize(750,750); // sets the x-dimension, and y-dimension of frame
        frame.setVisible(true); //makes it visible
        bluePanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
    
}
