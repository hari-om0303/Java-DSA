package AWT_WATCH;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Watch extends JFrame {
    JLabel timeLabel, dateLabel;
    SimpleDateFormat timeFormat, dateFormat;
    String time, date;

    Watch(String title) {
        super(title);
        setLayout(null);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setComponents();
        updateClock(); // Start clock
    }

    void setComponents() {
        // Initialize labels
        timeLabel = new JLabel();
        dateLabel = new JLabel();

        // Fonts and Colors
        Font font = new Font("Verdana", Font.BOLD, 30);
        Color textColor = Color.RED.brighter();

        timeLabel.setFont(font);
        timeLabel.setForeground(textColor);
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);

        dateLabel.setFont(font);
        dateLabel.setForeground(textColor);
        dateLabel.setBackground(Color.BLACK);
        dateLabel.setOpaque(true);

        // Positioning
        timeLabel.setBounds(50, 50, 200, 80);
        dateLabel.setBounds(50, 150, 200, 80);

        // Add to frame
        add(timeLabel);
        add(dateLabel);

        // Date format
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dateFormat = new SimpleDateFormat("MM-dd-yyyy");
    }

    void updateClock() {
        Timer timer = new Timer(1000, e -> {
            time = timeFormat.format(Calendar.getInstance().getTime());
            date = dateFormat.format(Calendar.getInstance().getTime());

            timeLabel.setText(time);
            dateLabel.setText(date);
        });
        timer.start();
    }
}
public class main {
    public static void main(String[] args) {
        new Watch("Digital Watch");
    }
}
