package guipractice;

import  java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    
    ImageIcon file = new ImageIcon("src/folder.png");
    ImageIcon saving = new ImageIcon("src/save.png");
    ImageIcon exitDoor = new ImageIcon("src/door.png");
    
    MyFrame(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        
        menuBar = new JMenuBar();
        
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        
        loadItem.setIcon(file);
        saveItem.setIcon(saving);
        exitItem.setIcon(exitDoor);
        
        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for file
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E for edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for help
        loadItem.setMnemonic(KeyEvent.VK_L); // L for load from keyboard
        saveItem.setMnemonic(KeyEvent.VK_S); // S for save from keyboard
        exitItem.setMnemonic(KeyEvent.VK_E); // E for exit from keyboard
        
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        
        this.add(menuBar);
        this.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==loadItem) {
            System.out.println("*beep boop* you loaded a file");
        } else if (e.getSource()==saveItem) {
            System.out.println("*beep boop* you saved a file");
        } else if (e.getSource()==exitItem) {
            System.exit(0);
        }
    }
    
}
