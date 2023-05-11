package com.IMCONSALTING.action;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Action implements Serializable {
    private int id;
    private LocalDate date;
    private int id_customer;
    private int id_employee;
    private int id_channel;
    private int id_response;
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

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public int getId_channel() {
        return id_channel;
    }

    public void setId_channel(int id_channel) {
        this.id_channel = id_channel;
    }

    public int getId_response() {
        return id_response;
    }

    public void setId_response(int id_response) {
        this.id_response = id_response;
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
        return id == action.id && id_customer == action.id_customer && id_employee == action.id_employee && id_channel == action.id_channel && id_response == action.id_response && Objects.equals(date, action.date) && Objects.equals(description, action.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, id_customer, id_employee, id_channel, id_response, description);
    }

    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", date=" + date +
                ", id_customer=" + id_customer +
                ", id_employee=" + id_employee +
                ", id_channel=" + id_channel +
                ", id_response=" + id_response +
                ", description='" + description + '\'' +
                '}';
    }
}