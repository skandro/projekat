package com.IMCONSALTING;

import com.IMCONSALTING.company.Company;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class Demo {
    public static void main(String[] args) {

        /*Customer customer = new Customer();
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
        System.out.println(customer.getEmployee().getName());*/


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectPU");
        System.out.println("ddddd");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        Query query = manager.createNamedQuery("Company.findAll");
        List<Company> list = query.getResultList();
        manager.getTransaction().commit();
        list.forEach(System.out::println);

    }
}