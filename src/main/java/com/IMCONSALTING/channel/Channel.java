package com.IMCONSALTING.channel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Table(name = "channels", catalog = "project")
public class Channel implements Serializable {
    @Id
    @Column(name = "id")
    private int idProfession;
    private String professionName;

    public Channel() {
    }

    public int getIdProfession() {
        return idProfession;
    }

    public void setIdProfession(int idProfession) {
        this.idProfession = idProfession;
    }

    public String getNameProfession() {
        return professionName;
    }

    public void setNameProfession(String nameProfession) {
        this.professionName = nameProfession;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "idProfession=" + idProfession +
                ", nameProfession='" + professionName + '\'' +
                '}';
    }
}