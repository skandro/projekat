package com.IMCONSALTING;

import com.IMCONSALTING.hibernate.SessionFactoryUtil;
import com.IMCONSALTING.prfession.Profession;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
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

        Session session= SessionFactoryUtil.getSessionFactory().openSession();

        session.getTransaction().begin();
        List<Profession> customers=new ArrayList<>();
        Query query=session.createQuery("from Profession");
        customers=query.list();
        session.getTransaction().commit();
        customers.forEach(System.out::println);

    }
}