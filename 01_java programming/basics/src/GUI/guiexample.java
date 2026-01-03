package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guiexample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome to MY PAGE");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Using absolute layout

        JLabel label = new JLabel("Please login:");
        label.setBounds(150, 20, 150, 30);

        JTextField userfield = new JTextField("Username");
        userfield.setBounds(75, 60, 250, 30);
        userfield.setForeground(Color.GRAY);

        JTextField passfield = new JTextField("Password");
        passfield.setBounds(75, 100, 250, 30);
        passfield.setForeground(Color.GRAY);

        // Placeholder behavior for username
        userfield.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (userfield.getText().equals("Username")) {
                    userfield.setText("");
                    userfield.setForeground(Color.BLACK);
                }
            }
            public void focusLost(FocusEvent e) {
                if (userfield.getText().isEmpty()) {
                    userfield.setText("Username");
                    userfield.setForeground(Color.GRAY);
                }
            }
        });

        // Placeholder behavior for password
        passfield.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (passfield.getText().equals("Password")) {
                    passfield.setText("");
                    passfield.setForeground(Color.BLACK);
                }
            }
            public void focusLost(FocusEvent e) {
                if (passfield.getText().isEmpty()) {
                    passfield.setText("Password");
                    passfield.setForeground(Color.GRAY);
                }
            }
        });

        JButton login = new JButton("Login");
        login.setBounds(75, 150, 100, 30);

        JButton clear = new JButton("Clear");
        clear.setBounds(225, 150, 100, 30);

        clear.addActionListener(e -> {
            userfield.setText("Username");
            userfield.setForeground(Color.GRAY);
            passfield.setText("Password");
            passfield.setForeground(Color.GRAY);
        });

        // Add components to frame
        frame.add(label);
        frame.add(userfield);
        frame.add(passfield);
        frame.add(login);
        frame.add(clear);

        frame.setVisible(true);
    }
}
