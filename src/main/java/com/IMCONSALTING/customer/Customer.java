package com.IMCONSALTING.customer;

import com.IMCONSALTING.company.Company;
import com.IMCONSALTING.employee.Employee;
import com.IMCONSALTING.empstatus.EmpStatus;
import com.IMCONSALTING.profession.Profession;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "customers", catalog = "project")
public class Customer implements Serializable {
    @Id
    @Column(name = "id", insertable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int id;

    @Basic(optional = false)
    private String name;

    @Basic(optional = false)
    private String surname;

    @Basic(optional = false)
    private LocalDate birthday;

    @Basic(optional = false)
    private String address;

    @Basic(optional = false)
    private String mobile;

    @Basic(optional = false)
    private String email;

    @Basic(optional = false)
    @Column(name = "id_empstatus")
    private EmpStatus empStatus;

    @Basic(optional = false)
    @Column(name = "id_profession")
    private Profession profession;

    @Column(name = "id_company")
    private Company company;

    @Basic(optional = false)
    @Column(name = "id_employee")
    private Employee employee;

    @Basic(optional = false)
    @Column(name = "date_registry")
    private LocalDate dateRegisty;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public LocalDate getDateRegisty() {
        return dateRegisty;
    }

    public void setDateRegisty(LocalDate dateRegisty) {
        this.dateRegisty = dateRegisty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", empStatus=" + empStatus +
                ", profession=" + profession +
                ", company=" + company +
                ", employee=" + employee +
                ", dateRegisty=" + dateRegisty +
                '}';
    }
}