package com.IMCONSALTING.empstatus;

public enum EmpStatus1 {
    Zaposlen(1, "Zaposlen"),
    Nezaposlen(2, "Nezaposlen"),
    Penzioner(3, "Penzioner"),
    Student(4, "Student");

    private int id;
    private String name;

    private EmpStatus1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}