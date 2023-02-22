package org.example.objects;

public class Student {

    int id;

    String name;

    private String lastName;

    public void setLastName(String jk) {
        this.lastName = jk;
    }

    public void printMyDta() {
        System.out.println(name);
        System.out.println(lastName);
    }

    public Student() {

    }

    public Student(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
}

