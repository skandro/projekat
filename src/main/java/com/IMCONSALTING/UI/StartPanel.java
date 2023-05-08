package com.IMCONSALTING.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.LocalDate;

public class StartPanel extends JPanel {

    private final JLabel welcomeLabel = new JLabel("WELCOME");
    private final JButton buttonCustomers = new JButton("Customers");
    private final JButton buttonEmployees = new JButton("Employees");
    private final JButton buttonOthers = new JButton("Others");
    private final JLabel dateLabel = new JLabel();
    private JLabel pictureLabel = new JLabel();

    public StartPanel() {
        actionComponents();
        addComponent();
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }


    private void actionComponents() {
        pictureLabel.setIcon(new ImageIcon("1.jpg"));
        dateLabel.setText(returnDate());
        buttonOthers.addActionListener(this::buttonOthersListener);
        buttonCustomers.addActionListener(this::buttonCustomersListener);
        buttonEmployees.addActionListener(this::buttonEmployeessListener);
    }

    private void addComponent() {
        JPanel welcomePanel = new JPanel();
        welcomePanel.add(welcomeLabel);
        welcomePanel.setSize(100, 10);
        welcomePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));


        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 3));
        buttonsPanel.add(buttonCustomers);
        buttonsPanel.add(buttonEmployees);
        buttonsPanel.add(buttonOthers);

        JPanel dateAndLogoPanel = new JPanel();
        dateAndLogoPanel.setLayout(new GridLayout(1, 2));
        dateAndLogoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        dateAndLogoPanel.add(dateLabel);
        dateAndLogoPanel.add(pictureLabel);
        dateAndLogoPanel.setSize(new Dimension(100, 400));


        add(welcomePanel);
        add(buttonsPanel);
        add(dateAndLogoPanel);

    }

    private String returnDate() {
        LocalDate localDate = LocalDate.now();
        return localDate.toString();
    }

    private void buttonOthersListener(ActionEvent e) {
        JFrame frame = new JFrame("Others");
        NekiPanel nekiPanel = new NekiPanel();
        frame.setContentPane(nekiPanel);
        frame.setSize(new Dimension(300, 300));

        frame.setVisible(true);
    }

    private void buttonCustomersListener(ActionEvent e) {
        JFrame frame = new JFrame("Customers");
        NekiPanel nekiPanel = new NekiPanel();
        frame.setContentPane(nekiPanel);
        frame.setSize(new Dimension(300, 300));

        frame.setVisible(true);
    }

    private void buttonEmployeessListener(ActionEvent e) {
        JFrame frame = new JFrame("Employees");
        EmployeePanel employeePanel = new EmployeePanel();
        frame.setContentPane(employeePanel);
        frame.setLocationRelativeTo(null);
        frame.setSize(new Dimension(300, 300));

        frame.setVisible(true);
    }

}