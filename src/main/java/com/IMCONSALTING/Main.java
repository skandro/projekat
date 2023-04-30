package com.IMCONSALTING;

import com.IMCONSALTING.customer.Customer;
import com.IMCONSALTING.employee.Employee;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setAddress("Zmaja pdbosne");
        customer.setBirthday(LocalDate.of(1998,5,1));
        customer.setId(1);
        customer.setEmail("ivica@gmail.com");
        customer.setName("Ivica");
        customer.setSurname("Stanic");
        customer.setMobile("061 123456");
        customer.setDateRegistry(LocalDate.of(2023,1,1));

        Employee employee =new Employee();
        employee.setId(1);
        employee.setName("mirsad");
        employee.setSurname("Skandro");

        customer.setEmployee(employee);


        System.out.println(customer.getEmployee().getName());

    }
}