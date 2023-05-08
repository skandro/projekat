package com.IMCONSALTING.channel;

public enum Channel1 {

    Sastanak(1, "Sastanak"),
    Poziv(2, "Poziv"),
    Email(3, "Email");

    private int id;
    private String name;

    private Channel1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}