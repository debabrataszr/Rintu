package com.bridgelabz.practice;

public class Name {
    String firstname;
    String middlename;
    String lastname;

    @Override
    public String toString() {
        return "Name { "+
                "firstname'" + firstname + '\'' +
                ",middlename='" + middlename + '\'' +
                ",lastname='" + lastname + '\'' +
                '}';
    }

}
