package com.IMCONSALTING.employee;

import com.IMCONSALTING.UI.StartPanel;
import com.IMCONSALTING.employee.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class EmployeePanel extends JPanel {
    private JTable employeeTable;
    private List<Employee> employeeList;
    private final JTextField nameTextField = new JTextField();
    private final JLabel nameLabel = new JLabel("Name: ", SwingConstants.TRAILING);
    private final JTextField surnameTextField = new JTextField();
    private final JLabel surnameLabel = new JLabel("Surname", SwingConstants.TRAILING);
    private final JButton buttonAddEmployee = new JButton("Add employee");
    private final JButton buttonDeleteEmployee=new JButton("Delete Employee");



    public EmployeePanel() {
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        actionComponents();
    }

    private void actionComponents() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projectPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT e FROM Employee e");
        employeeList = query.getResultList();
        entityManager.getTransaction().commit();

        EmployeeTableModel employeeTableModel = new EmployeeTableModel();
        employeeTable = new JTable(employeeTableModel);
        JScrollPane employeeTableScrollPane = new JScrollPane(employeeTable);
        add(employeeTableScrollPane);

        JPanel namePanel = new JPanel();
        namePanel.add(nameLabel);
        nameTextField.setEditable(true);
        nameTextField.setColumns(10);
        namePanel.add(nameTextField);

        JPanel surnamePanel = new JPanel();
        surnamePanel.add(surnameLabel);
        surnameTextField.setEditable(true);
        surnameTextField.setColumns(10);
        surnamePanel.add(surnameTextField);

        JPanel buttonPanel = new JPanel();
        buttonAddEmployee.addActionListener(this::ButtonAddListener);
        buttonPanel.add(buttonAddEmployee);

        buttonDeleteEmployee.addActionListener(this::ButtonDeleteListener);

        add(namePanel);
        add(surnamePanel);
        add(buttonPanel);
        add(buttonDeleteEmployee);



    }

    private void ButtonDeleteListener(ActionEvent event){
        Employee employee=employeeList.get(employeeTable.getSelectedRow());
        EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("projectPU");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(employee);
        entityManager.getTransaction().commit();
    }

    private void ButtonAddListener(ActionEvent event){
        EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("projectPU");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        Employee employee=new Employee();
        employee.setName(nameTextField.getText());
        employee.setSurname(surnameTextField.getText());
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        nameTextField.setText("");
        surnameTextField.setText("");
    }

    private class EmployeeTableModel extends AbstractTableModel {

        private List<String> columnNames = new ArrayList<>();

        public EmployeeTableModel() {

            columnNames.add("id");
            columnNames.add("name");
            columnNames.add("surname");
            //this.columnNames = playerDao.getColumnNames();
        }

        @Override
        public int getRowCount() {
            return employeeList.size();
        }

        @Override
        public int getColumnCount() {
            return columnNames.size();
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Employee employee = employeeList.get(rowIndex);
            //EmployeeWrapper employeeWrapper = new EmployeeWrapper(employee);
            //Object employeeFieldOnIndex = employeeWrapper.getColumValue(columnIndex);
            EmployeeWrapper employeeWrapper=new EmployeeWrapper(employee);
            return employeeWrapper.getColumValue(columnIndex);
        }

        /**
         * @param aValue      value to assign to cell
         * @param rowIndex    row of cell
         * @param columnIndex column of cell
         */
        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("projectPU");
            EntityManager entityManager=entityManagerFactory.createEntityManager();
            Employee employee=employeeList.get(rowIndex);
            EmployeeWrapper employeeWrapper=new EmployeeWrapper(employee);
            employeeWrapper.setColumnValue(aValue,columnIndex);
            entityManager.getTransaction().begin();
            entityManager.merge(employee);
            entityManager.getTransaction().commit();
        }

        @Override
        public String getColumnName(int column) {
            return columnNames.get(column);
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            Class<?> clazz = getValueAt(0, columnIndex).getClass();
            return clazz;
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return columnIndex > 0;
        }


    }
}