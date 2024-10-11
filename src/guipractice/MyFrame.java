package guipractice;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
    
    NewWindow panel;
    
    MyFrame() {
        
        panel = new NewWindow();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        
        this.add(panel);
        this.pack();
        this.setLayout(null);
        this.setVisible(true);
        
    }
    
}
