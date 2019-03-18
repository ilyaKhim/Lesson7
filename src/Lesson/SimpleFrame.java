package Lesson;

import javax.swing.*;
import java.awt.*;

public class SimpleFrame {
    public static void createGUI(){
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Test label");
        frame.getContentPane().add(label);
        frame.setPreferredSize(new Dimension(2000, 1000));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createGUI();
            }
        });
    }
}
