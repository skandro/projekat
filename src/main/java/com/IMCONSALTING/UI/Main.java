package com.IMCONSALTING.UI;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    public static void createAndShowGUI() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        JFrame frame = new JFrame();
        frame.setTitle("Project");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400, 400));
        StartPanel startPanel = new StartPanel();
        frame.setContentPane(startPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}