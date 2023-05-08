package com.IMCONSALTING;

import com.IMCONSALTING.company.Company;
import com.IMCONSALTING.customer.Customer;
import com.IMCONSALTING.employee.Employee;
import com.IMCONSALTING.profession.Profession;
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
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        Query query = manager.createQuery("SELECT c FROM Company c");
        List<Company> list = query.getResultList();
        manager.getTransaction().commit();
        list.forEach(System.out::println);


        manager.getTransaction().begin();
        Query query1 = manager.createQuery("SELECT p FROM Profession p");
        List<Profession> list1 = query1.getResultList();
        manager.getTransaction().commit();
        list1.forEach(System.out::println);

        manager.getTransaction().begin();
        Query query2 = manager.createQuery("SELECT e FROM Employee e");
        List<Employee> list2 = query2.getResultList();
        manager.getTransaction().commit();
        list2.forEach(System.out::println);

        System.out.println("-------------------------------");

        manager.getTransaction().begin();
        Query query3 = manager.createQuery("SELECT c FROM Customer c");
        List<Customer> list3 = query3.getResultList();
        manager.getTransaction().commit();
        list3.forEach(System.out::println);
    }
}