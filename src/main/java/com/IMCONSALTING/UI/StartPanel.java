package com.IMCONSALTING.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.time.LocalDate;
import java.util.Date;

public class StartPanel extends JPanel {

    private final JButton buttonCustomers=new JButton("Customers");
    private final JButton buttonEmployees=new JButton("Employees");
    private final JButton buttonOthers=new JButton("Others");
    private final JLabel dateLabel=new JLabel();
    private final JLabel welcomeLabel=new JLabel("WELCOME");
    private JLabel pictureLabel;

    public StartPanel(){
        //setLayout(new BorderLayout());
        actionComponents();
        addComponent();
    }


    private void actionComponents() {
        dateLabel.setText(returnDate());
        buttonOthers.addActionListener(this::buttonOthersListener);
        buttonCustomers.addActionListener(this::buttonCustomersListener);
        buttonEmployees.addActionListener(this::buttonEmployeessListener);
    }

    private void addComponent(){
        add(welcomeLabel);
        add(buttonCustomers);
        add(buttonEmployees);
        add(buttonOthers);
        add(dateLabel);

    }

    private String returnDate(){
        LocalDate localDate=LocalDate.now();
        return localDate.toString();
    }

    private void buttonOthersListener(ActionEvent e){
        JFrame frame =new JFrame("Others");
        NekiPanel nekiPanel=new NekiPanel();
        frame.setContentPane(nekiPanel);
        frame.setSize(new Dimension(300,300));

        frame.setVisible(true);
    }

    private void buttonCustomersListener(ActionEvent e){
        JFrame frame =new JFrame("Customers");
        NekiPanel nekiPanel=new NekiPanel();
        frame.setContentPane(nekiPanel);
        frame.setSize(new Dimension(300,300));

        frame.setVisible(true);
    }

    private void buttonEmployeessListener(ActionEvent e){
        JFrame frame =new JFrame("Employees");
        NekiPanel nekiPanel=new NekiPanel();
        frame.setContentPane(nekiPanel);
        frame.setSize(new Dimension(300,300));

        frame.setVisible(true);
    }



}
