package com.example.demo.config;

import java.io.Serializable;

public class test implements Serializable {
    static public String name;
    static public String address;
    static public transient int SSN;
    static public int number;
    public static void main(String[] args) {
        System.out.println("Mailing a check to " + name
                + " " + address);

    }
}
