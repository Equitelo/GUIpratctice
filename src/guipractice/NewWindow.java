package guipractice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewWindow extends JPanel{
    
    ImageIcon curious = new ImageIcon("src/hmm.png");;
    final int WIDTH = curious.getIconWidth();
    final int HEIGHT = curious.getIconHeight();
    Point imageCorner;
    Point prevPt;
    
    NewWindow(){
        
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        curious.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }
    
    private class ClickListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }
    } 
    
    private class DragListener extends MouseMotionAdapter{
        @Override
        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();
            
            imageCorner.translate((int)(currentPt.getX() - prevPt.getX()),
                                  (int)(currentPt.getY() - prevPt.getY()));
            prevPt = currentPt;
            repaint();
        }
        
    }
}
