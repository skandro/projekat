package com.IMCONSALTING.convertors;

import com.IMCONSALTING.employee.Employee;
import jakarta.persistence.*;

@Converter(autoApply = true)
public class EmployeeConverter implements AttributeConverter<Employee, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Employee employee) {
        Integer idEmployee = employee.getIdEmployee();
        return idEmployee;
    }

    @Override
    public Employee convertToEntityAttribute(Integer id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projectPU");
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        Employee employee = manager.find(Employee.class, id);
        manager.getTransaction().commit();
        return employee;

    }
}