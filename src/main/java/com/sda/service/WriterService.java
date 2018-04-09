package com.sda.service;

public class WriterService {
    public String write(String name){

        if (name != null && name.toUpperCase().equals(name)){
            return "HELLO " + name + ".";
        }

        String nameToDisplay = name == null ? "my friend" : name;
        return "Hello " + nameToDisplay + ".";
    }
}
