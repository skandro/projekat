package com.IMCONSALTING.customer;


import com.IMCONSALTING.company.Company;
import com.IMCONSALTING.employee.Employee;
import com.IMCONSALTING.empstatus.EmpStatus;
import com.IMCONSALTING.prfession.Profession;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Customer implements Serializable {

    private int id;
    private String name;
    private String surname;
    private LocalDate birthday;
    private String address;
    private String email;
    private String mobile;
    private EmpStatus empStatus;
    private Profession profession;
    private Company company;
    private Employee employee;
    private LocalDate dateRegistry;

    public Customer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



    public LocalDate getDateRegistry() {
        return dateRegistry;
    }

    public void setDateRegistry(LocalDate dateRegistry) {
        this.dateRegistry = dateRegistry;
    }

    public EmpStatus getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(EmpStatus empStatus) {
        this.empStatus = empStatus;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) && Objects.equals(birthday, customer.birthday) && Objects.equals(address, customer.address) && Objects.equals(email, customer.email) && Objects.equals(mobile, customer.mobile) && Objects.equals(empStatus, customer.empStatus) && Objects.equals(profession, customer.profession) && Objects.equals(company, customer.company) && Objects.equals(employee, customer.employee) && Objects.equals(dateRegistry, customer.dateRegistry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, birthday, address, email, mobile, empStatus, profession, company, employee, dateRegistry);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", empStatus=" + empStatus +
                ", profession=" + profession +
                ", company=" + company +
                ", employee=" + employee +
                ", dateRegistry=" + dateRegistry +
                '}';
    }
}

