import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory; 

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class GUI {

    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton button = new JButton("Button");
        JLabel label = new JLabel("Number of clicks: 0");

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI Test");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
