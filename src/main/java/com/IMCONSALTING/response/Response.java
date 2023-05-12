package com.IMCONSALTING.response;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Table(name = "responses", catalog = "project")
public class Response implements Serializable {

    @Id
    @Column(name = "id")
    private int idResponse;

    private String responseName;

    public Response() {
    }

    public int getId() {
        return idResponse;
    }

    public void setId(int id) {
        this.idResponse = id;
    }

    public String getResponseName() {
        return responseName;
    }

    public void setResponseName(String responseName) {
        this.responseName = responseName;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + idResponse +
                ", responseName='" + responseName + '\'' +
                '}';
    }
}