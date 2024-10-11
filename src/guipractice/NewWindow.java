package guipractice;

import java.awt.*;
import java.awt.*;
import javax.swing.*;

public class NewWindow extends JPanel{
    
    Image image;
    
    NewWindow () {
        image = new ImageIcon("src/100.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }
    
    public void paint (Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        
        g2D.drawImage(image, 0, 0, null);
        
        g2D.setPaint(Color.red);
        //                       (thickness)
        g2D.setStroke(new BasicStroke(5));
        //g2D.drawLine(0, 0, 500, 500); this makes a line that corres the panel

        //g2D.drawRect(0, 0, 100, 200); 
        //g2D.fillRect(0, 0, 100, 200);
        
        //g2D.drawOval(0, 0, 100, 100);
        //g2D.fillOval(0, 0, 100, 100);
        
        //g2D.drawArc(0, 0, 100, 100, 0, 180);
        
        /*Pokemon ball*/
        //g2D.fillArc(0, 0, 100, 100, 0, 180);
        //g2D.setPaint(Color.white);
        //g2D.fillArc(0, 0, 100, 100, 180, 180);
        
        int []xPoints = {150, 250, 350};
        int []yPoints = {300, 150, 300};
        g2D.setPaint(Color.magenta);
        g2D.fillPolygon(xPoints, yPoints, 3);
        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2D.drawString("U R A WINNER!", 50, 50);
        
        
    }
    
}
