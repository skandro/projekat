package com.IMCONSALTING.response;

import java.io.Serializable;
import java.util.Objects;

public class Response implements Serializable {
    private int id;
    private String name;

    public Response() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return id == response.id && Objects.equals(name, response.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}