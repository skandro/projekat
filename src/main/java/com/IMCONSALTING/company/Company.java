package com.IMCONSALTING.company;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "companies", catalog = "project") // companies je naziv tabele u bazi, project je ime baze
//@NamedQueries({@NamedQuery(name = "upit", query = "SELECT c FROM Company c")})
public class Company implements Serializable {

    @Id
    @Column(name = "id")
    private int idCompany;
    private String companyName;
    private String companyAddress;
    private String companyContact;

    public Company() {
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    @Override
    public String toString() {
        return "Company{" +
                "idCompany=" + idCompany +
                ", companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", companyContact='" + companyContact + '\'' +
                '}';
    }

}