package com.IMCONSALTING.action;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Action implements Serializable {
    private int idAction;
    private LocalDate date;
    private int idCustomer;
    private int idEmployee;
    private int idChannel;
    private int idResponse;
    private String descriptionName;

    public Action() {
    }

    public int getIdAction() {
        return idAction;
    }

    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getIdChannel() {
        return idChannel;
    }

    public void setIdChannel(int idChannel) {
        this.idChannel = idChannel;
    }

    public int getIdResponse() {
        return idResponse;
    }

    public void setIdResponse(int idResponse) {
        this.idResponse = idResponse;
    }

    public String getDescriptionName() {
        return descriptionName;
    }

    public void setDescriptionName(String descriptionName) {
        this.descriptionName = descriptionName;
    }

    @Override
    public String toString() {
        return "Action{" +
                "idAction=" + idAction +
                ", date=" + date +
                ", idCustomer=" + idCustomer +
                ", idEmployee=" + idEmployee +
                ", idChannel=" + idChannel +
                ", idResponse=" + idResponse +
                ", descriptionName='" + descriptionName + '\'' +
                '}';
    }
}
