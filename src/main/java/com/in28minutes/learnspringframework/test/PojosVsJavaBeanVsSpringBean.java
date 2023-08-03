package com.in28minutes.learnspringframework.test;

import java.io.Serializable;

class Pojo { // plain old Java object
    private String text;
    private int number;
    public String toString() {
        return text + ": " + number;
    }
}

class JavaBean implements Serializable { //3: implements Serializable
// EJB -> Enterprise Java Beans
    //1: public default (no argument) constructor
    public JavaBean () {
    }

    private String text;
    private int number;

    //2: getters and setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

// Anything that is managed by Spring framework is what is called a Spring Bean

public class PojosVsJavaBeanVsSpringBean {
    public static void main(String[] args) {
        Pojo pojo = new Pojo();
        System.out.println(pojo);
    }
}
