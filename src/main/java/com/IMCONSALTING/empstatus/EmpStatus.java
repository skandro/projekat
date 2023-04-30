package com.IMCONSALTING.empstatus;

import java.util.Objects;

public class EmpStatus {
    private int idEmpStatus;
    private String name;

    public EmpStatus(){}

    public int getIdEmpStatus() {
        return idEmpStatus;
    }

    public void setIdEmpStatus(int idEmpStatus) {
        this.idEmpStatus = idEmpStatus;
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
        EmpStatus empStatus = (EmpStatus) o;
        return idEmpStatus == empStatus.idEmpStatus && name.equals(empStatus.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpStatus, name);
    }

    @Override
    public String toString() {
        return "EmpStatus{" +
                "idEmpStatus=" + idEmpStatus +
                ", name='" + name + '\'' +
                '}';
    }
}
