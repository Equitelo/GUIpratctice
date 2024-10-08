package guipractice;

import  java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyFrame extends JFrame implements ChangeListener{
    
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    
    MyFrame(){
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        ///                 (min, max, starting point)
        slider = new JSlider(0, 100, 50);
        
        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        //             (how many units to show up)
        slider.setMinorTickSpacing(10);
        
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV BOLi", Font.PLAIN,15));
        label.setFont(new Font("MV BOLi", Font.PLAIN,25));
        
        slider.setOrientation(SwingConstants.VERTICAL);
        
        label.setText("°C = "+slider.getValue());
        
        slider.addChangeListener(this);
        
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);
    }
    
    @Override
    public void stateChanged(ChangeEvent e){
        
        label.setText("°C = "+slider.getValue());
        
    }
    
}
