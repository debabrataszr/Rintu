package org.example.objects;

public class Contact {
    String name;
    String lastname;
    String number;
    String address;
    String nametoedit;
    String lastnametoedit;
    String numbertoedit;
    String addresstoedit;


    public void printDetails() {
        System.out.println(name);
        System.out.println(lastname);
        System.out.println(number);
        System.out.println(address);
    }

    public void updateDetails() {
        System.out.println(nametoedit);
        System.out.println(lastnametoedit);
        System.out.println(numbertoedit);
        System.out.println(addresstoedit);
    }


    public Contact() {
    }

    public Contact(String name, String lastname, String number, String address) {
        this.name = name;
        this.lastname = lastname;
        this.number=number;
        this.address=address;


    }
}