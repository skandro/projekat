package com.IMCONSALTING.UI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class StartPanel extends JFrame {

    public StartPanel() {
        super("Start Panel");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pane = new JPanel();
        JButton buttonCustomers = new JButton("Customers");
        JButton buttonEmployees = new JButton("Employees");
        JButton buttonOthers = new JButton("Others");



        JLabel slika = new JLabel(); //JLabel Creation
        slika.setIcon(new ImageIcon("src/main/resources/1.jpg")); //Sets the image to be displayed as an icon
        Dimension size = slika.getPreferredSize(); //Gets the size of the image


        Date dateNow = new Date(); // current date and time
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String timeString = timeFormat.format(dateNow);

        JLabel dateLabel = new JLabel(timeString);

        pane.setLayout(null);

        buttonCustomers.setBounds(20,50,100,50);
        pane.add(buttonCustomers);
        buttonEmployees.setBounds(180,50,100,50);
        pane.add(buttonEmployees);
        buttonOthers.setBounds(340,50,100,50);
        pane.add(buttonOthers);
        dateLabel.setBounds(200,150,100,100);
        pane.add(dateLabel);
        pane.add(slika);
        //slika.setSize(new Dimension(100,100));
        slika.setBounds(150,150,350,350);



        add(pane);


        //JButton buttonEmployees = new JButton("Employees");
        //JButton buttonOthers = new JButton("Others");
        //JLabel dateLabel = new JLabel();
        //JLabel welcomeLabel = new JLabel("WELCOME");

        setVisible(true);


    }

    public static void showTime() {



        //Date date = new Date();
        //DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        //String vrijeme = timeFormat.format(date);

    }



}
