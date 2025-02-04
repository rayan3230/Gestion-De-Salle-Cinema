package Gui;

import javax.swing.*;
import java.awt.*;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Icon Example");

        // Load your custom icon (make sure it's in the same directory or provide the
        // full path)
        ImageIcon icon = new ImageIcon("Gui/CinemaLogo.ico"); // Replace with your icon path
        frame.setIconImage(icon.getImage());

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
