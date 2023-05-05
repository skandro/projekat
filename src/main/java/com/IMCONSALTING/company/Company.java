package com.IMCONSALTING.company;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table (name="companies",catalog = "project") // companies je naziv tabele u bazi, project je ime baze
@NamedQueries(
        {
                @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c")
        }
)

public class Company implements Serializable {

    @Id
    @Column (name="id_company")
    private int id;
    private String name;
    private String address;
    private String contact;

    public Company(){}

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id && Objects.equals(name, company.name) && Objects.equals(address, company.address) && Objects.equals(contact, company.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, contact);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}