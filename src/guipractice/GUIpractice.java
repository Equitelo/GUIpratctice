package guipractice;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUIpractice {

    public static void main(String[] args) {
        
        // JOptionPane = pop up a standard dialog box that prompts users for a value
        //               or informs them of something.
        
        //                                                                           icon for the message
        JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
        
        int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "MyTitle", JOptionPane.YES_NO_CANCEL_OPTION);
        
        String name = JOptionPane.showInputDialog("What is your name?: ");
        String[] responses = {"No, you are awesome","Thank You","*blush*"};
        
        ImageIcon icon = new ImageIcon("src/lobo.png");
        JOptionPane.showOptionDialog(null, 
                                    "Awesome", 
                                    "Secret Message", 
                                    JOptionPane.YES_NO_CANCEL_OPTION, 
                                    JOptionPane.PLAIN_MESSAGE, 
                                    icon, 
                                    responses, 
                                    0);
        
    }
    
}
