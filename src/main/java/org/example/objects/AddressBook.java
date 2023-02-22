package org.example.objects;

import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);
    Contact[] c1Arr= new Contact[2];
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.showDetails();
        addressBook.printDetails();
        addressBook.editDetails();
        addressBook.updateDetails();
    }

    private void showDetails() {
        for (int i = 0; i < c1Arr.length; i++) {

            Contact c = new Contact();
            System.out.println("Enter name:");
            c.name = sc.nextLine();
            System.out.println("Enter lastname :");
            c.lastname = sc.nextLine();
            System.out.println("Enter number :");
            c.number = sc.nextLine();
            System.out.println("Enter address :");
            c.address = sc.nextLine();
            c1Arr[i] = c;

        }


    }

    private void printDetails() {
        for (int i = 0; i < c1Arr.length; i++) {

            System.out.println(c1Arr[i].name);
            System.out.println(c1Arr[i].lastname);
            System.out.println(c1Arr[i].number);
            System.out.println(c1Arr[i].address);


        }

    }

    private void editDetails() {
        for (int i = 0; i < c1Arr.length; i++) {

            Contact c2 = new Contact();
            System.out.println("Enter name to edit:");
            c2.nametoedit = sc.nextLine();
            System.out.println("Enter lastname to edit :");
            c2.lastnametoedit = sc.nextLine();
            System.out.println("Enter number to edit :");
            c2.numbertoedit = sc.nextLine();
            System.out.println("Enter address to edit:");
            c2.addresstoedit = sc.nextLine();
            c1Arr[i] = c2;

        }

    }

    private void updateDetails() {
        for (int i = 0; i < c1Arr.length; i++) {
            System.out.println(c1Arr[i].nametoedit);
            System.out.println(c1Arr[i].lastnametoedit);
            System.out.println(c1Arr[i].numbertoedit);
            System.out.println(c1Arr[i].addresstoedit);

        }
        System.out.println("DETAILS UPDATED");
    }
}
