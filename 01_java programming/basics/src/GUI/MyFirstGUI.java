package GUI;

import javax.swing.*;   // All Swing components
import java.awt.*;      // For layout
import java.awt.event.*; // For button click

public class MyFirstGUI {
    public static void main(String[] args) {
        // Step 1: Create a frame (main window)
        JFrame frame = new JFrame("My First GUI App");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Step 2: Create components
        JLabel label = new JLabel("Hello, Swing!");
        JButton button = new JButton("Click Me");

        // Step 3: Add action listener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You clicked the button!");
            }
        });

        // Step 4: Add components to frame (layout = FlowLayout)
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button);

        // Step 5: Make the frame visible
        frame.setVisible(true);
    }
}
