package com.pitisha96;

public class Animal implements Pet{
    private String name;

    public Animal(final String name){
        setName(name);
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String name){
        this.name=name;
    }

}
