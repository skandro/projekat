package com.IMCONSALTING.UI;

import com.IMCONSALTING.employee.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class EmployeePanel extends JPanel {
    private JTable employeeTable;
    private List<Employee> employeeList;


    public EmployeePanel() {
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
    }


    public class EmployeeWrapper {
        private final Employee employee;

        //DI Dependency Injection

        public EmployeeWrapper(Employee employee) {
            this.employee = employee;
        }

        public Object getColumValue(int index) {
            switch (index) {
                case 0:
                    return employee.getId();
                case 1:
                    return employee.getName();
                case 2:
                    return employee.getSurname();
            }
            return null;
        }
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
            if (columnIndex == 0) return employee.getId();
            if (columnIndex == 1) return employee.getName();
            if (columnIndex == 2) return employee.getSurname();
            return employee;
        }

        /**
         * @param aValue      value to assign to cell
         * @param rowIndex    row of cell
         * @param columnIndex column of cell
         */
        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            //aValue MIRSO
            //rowIndex -> indeks reda u kojem se desila promjena

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