package com.IMCONSALTING.customer;

import com.IMCONSALTING.convertors.*;
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
    @Column(name = "id")
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCustomer;

    @Basic(optional = false)
    private String customerName;

    @Basic(optional = false)
    private String customerSurname;

    @Convert(converter = DateConverter.class, disableConversion = false)
    @Column(name = "birthday", nullable = false)
//    @Basic(optional = false)
//    @Column(name = "birthday")
    private LocalDate customerBirthday;

    @Basic(optional = false)
    private String customerAddress;

    @Basic(optional = false)
    private String customerEmail;

    @Basic(optional = false)
    private String customerMobile;

    @Basic(optional = false)
    @Column(name = "id")
    private EmpStatus customerEmpStatus;

    @Basic(optional = false)
    @Convert(converter = ProfessionConverter.class)
    @Column(name = "id")
    private Profession customerProfession;

    @Convert(converter = CompanyConverter.class)
    @Column(name = "id")
    private Company customerCompany;

    @Basic(optional = false)
    @Convert(converter = EmployeeConverter.class)
    @Column(name = "id")
    private Employee customerEmployee;

    @Convert(converter = DateConverter.class, disableConversion = false)
    @Column(name = "date_registry", nullable = false)
//  @Basic(optional = false)
//  @Column(name = "birthday")
//  @Temporal(TemporalType.DATE)
    private LocalDate dateRegistry;

    public Customer() {

    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public LocalDate getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(LocalDate customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public EmpStatus getCustomerEmpStatus() {
        return customerEmpStatus;
    }

    public void setCustomerEmpStatus(EmpStatus customerEmpStatus) {
        this.customerEmpStatus = customerEmpStatus;
    }

    public Profession getCustomerProfession() {
        return customerProfession;
    }

    public void setCustomerProfession(Profession customerProfession) {
        this.customerProfession = customerProfession;
    }

    public Company getCustomerCompany() {
        return customerCompany;
    }

    public void setCustomerCompany(Company customerCompany) {
        this.customerCompany = customerCompany;
    }

    public Employee getCustomerEmployee() {
        return customerEmployee;
    }

    public void setCustomerEmployee(Employee customerEmployee) {
        this.customerEmployee = customerEmployee;
    }

    public LocalDate getDateRegistry() {
        return dateRegistry;
    }

    public void setDateRegistry(LocalDate dateRegistry) {
        this.dateRegistry = dateRegistry;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", customerName='" + customerName + '\'' +
                ", customerSurname='" + customerSurname + '\'' +
                ", customerBirthday=" + customerBirthday +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerMobile='" + customerMobile + '\'' +
                ", customerEmpStatus=" + customerEmpStatus +
                ", customerProfession=" + customerProfession +
                ", customerCompany=" + customerCompany +
                ", customerEmployee=" + customerEmployee +
                ", dateRegistry=" + dateRegistry +
                '}';
    }
}

