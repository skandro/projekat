package com.IMCONSALTING.profession;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "profession", catalog = "project")
public class Profession implements Serializable {
    @Id
    @Column(name = "id")
    private int idProfession;
    private String professionName;

    public Profession() {
    }

    public int getIdProfession() {
        return idProfession;
    }

    public void setIdProfession(int idProfession) {
        this.idProfession = idProfession;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "idProfession=" + idProfession +
                ", professionName='" + professionName + '\'' +
                '}';
    }
}