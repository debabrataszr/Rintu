package org.example.objects;

public class Contact1 {
    String name;
    String lastname;
    String number;
    String address;
    String nametoedit;
    String lastnametoedit;
    String numbertoedit;
    String addresstoedit;
    String nametodelete;
    String lastnametodelete;
    String numbertodelete;
    String addresstodelete;

    public void printMyData() {
        System.out.println(name);
        System.out.println(lastname);
        System.out.println(number);
        System.out.println(address);
    }

    public void updateMyData() {
        System.out.println(nametoedit);
        System.out.println(lastnametoedit);
        System.out.println(numbertoedit);
        System.out.println(addresstoedit);
    }
    public void deleteMyData() {
        System.out.println(nametodelete);
        System.out.println(lastnametodelete);
        System.out.println(numbertodelete);
        System.out.println(addresstodelete);
    }
    public Contact1() {
    }

    public Contact1(String name, String lastname, String number, String address,String nametoedit,String lastnametoedit,String numbertoedit,String addresstoedit ,String nametodelete, String lastnametodelete, String numbertodelete, String addresstodelete) {
        this.name = name;
        this.lastname = lastname;
        this.number=number;
        this.address=address;
        this.nametoedit= nametoedit;
        this.lastnametoedit = lastnametoedit;
        this.numbertoedit=numbertoedit;
        this.addresstoedit=addresstoedit;
        this.nametodelete= nametodelete;
        this.lastnametodelete = lastnametodelete;
        this.numbertodelete=numbertodelete;
        this.addresstodelete=addresstodelete;

    }
}

