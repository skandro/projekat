package com.IMCONSALTING.UI;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);

    }

    public static void createAndShowGUI() {
        StartPanel sp = new StartPanel();
    }


}
