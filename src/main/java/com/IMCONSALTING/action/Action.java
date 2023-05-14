package com.IMCONSALTING.action;

import com.IMCONSALTING.channel.Channel;
import com.IMCONSALTING.customer.Customer;
import com.IMCONSALTING.employee.Employee;
import com.IMCONSALTING.response.Response;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Currency;
import java.util.Objects;

@Entity
@Table(name = "actions", catalog = "project")
public class Action implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int id;

    @Basic(optional = false)
    private LocalDate date;

    @Basic(optional = false)
    @Column(name = "id_customer")
    private Customer customer;

    @Basic(optional = false)
    @Column(name = "id_employee")
    private Employee employee;

    @Basic(optional = false)
    @Column(name = "id_channel")
    private Channel channel;

    @Basic(optional = false)
    @Column(name = "id_response")
    private Response response;

    @Basic(optional = false)
    private String description;

    public Action() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action = (Action) o;
        return id == action.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", date=" + date +
                ", customer=" + customer +
                ", employee=" + employee +
                ", channel=" + channel +
                ", response=" + response +
                ", description='" + description + '\'' +
                '}';
    }
}
