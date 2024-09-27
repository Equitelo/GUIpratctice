package guipractice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIpractice {

    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for components within a container
        
        //GridLayout = places components in a grid of cells.
        //             Each component takes all the available space within its cell,
        //             and each cell is the same size.
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //                             rows, columns, horizontal margin, vertical margin
        frame.setLayout(new GridLayout(3, 3, 10, 10));
        
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        
        frame.setVisible(true);
    }
    
}
