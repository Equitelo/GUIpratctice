package guipractice;

import  java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    
    JButton button;
    
    MyFrame(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        
        button = new JButton("Select File");
        button.addActionListener(this);
        
        this.add(button);
        this.pack();
        this.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button) {
            
            JFileChooser fileChooser = new JFileChooser();
            
            fileChooser.setCurrentDirectory(new File(""));// where do you want to start by default 
            
            int response = fileChooser.showOpenDialog(null); // select file to open
            //int response = fileChooser.showSaveDialog(null); changes the button
            
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
    
}
