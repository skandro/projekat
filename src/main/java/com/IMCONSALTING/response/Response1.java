package com.IMCONSALTING.response;

public enum Response1 {

    Uspjesno(1, "Uspjesno"),
    Neuspjesno(2, "Neuspjesno"),
    Djelimicno(3, "Djelimicno");

    private int id;
    private String name;

    private Response1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
