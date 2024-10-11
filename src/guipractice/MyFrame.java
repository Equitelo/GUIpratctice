package guipractice;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame {
    
    JFrame frame;
    JLabel label;
    
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    
    MyFrame() {
        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        
        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);
        
        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();
        
        //up                                          ("UP")
        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
        label.getActionMap().put("upAction", upAction);
        //down                                        ("DOWN")
        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
        label.getActionMap().put("downAction", downAction);
        //left                                        ("LEFT")
        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        //right                                       ("RIGHT")
        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
        label.getActionMap().put("rightAction", rightAction);
        
        frame.add(label);
        frame.setVisible(true);
    }
    
    public class UpAction extends AbstractAction {
        
        @Override 
        public void actionPerformed (ActionEvent e) {
            label.setLocation(label.getX(), label.getY()-10);
        }
    }
    
    public class DownAction extends AbstractAction {
        
        @Override 
        public void actionPerformed (ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+10);
        }
    }
    
    public class LeftAction extends AbstractAction {
        
        @Override 
        public void actionPerformed (ActionEvent e) {
            label.setLocation(label.getX()-10, label.getY());
        }
    }
    
    public class RightAction extends AbstractAction {
        
        @Override 
        public void actionPerformed (ActionEvent e) {
            label.setLocation(label.getX()+10, label.getY());
        }
    }
    
}
