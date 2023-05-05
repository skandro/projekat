package com.IMCONSALTING.UI;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame();
        frame.setTitle("Project");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        StartPanel startPanel = new StartPanel();
        frame.setContentPane(startPanel);
        frame.setVisible(true);


    }
}
