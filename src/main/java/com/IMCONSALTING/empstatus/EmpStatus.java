package com.IMCONSALTING.empstatus;

import java.io.Serializable;
import java.util.Objects;

public class EmpStatus implements Serializable {
    private int idEmpstatus;
    private String empstatusName;

    public EmpStatus() {
    }

    public int getIdEmpStatus() {
        return idEmpstatus;
    }

    public void setIdEmpStatus(int idEmpStatus) {
        this.idEmpstatus = idEmpStatus;
    }

    public String getName() {
        return empstatusName;
    }

    public void setName(String name) {
        this.empstatusName = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpStatus empStatus = (EmpStatus) o;
        return idEmpstatus == empStatus.idEmpstatus && empstatusName.equals(empStatus.empstatusName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpstatus, empstatusName);
    }

    @Override
    public String toString() {
        return "EmpStatus{" +
                "idEmpStatus=" + idEmpstatus +
                ", name='" + empstatusName + '\'' +
                '}';
    }
}