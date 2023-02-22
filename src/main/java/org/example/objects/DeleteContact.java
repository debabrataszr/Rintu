package org.example.objects;

import java.util.Scanner;

public class DeleteContact {
    static Scanner sc = new Scanner(System.in);
    Contact1[] c1Arr = new Contact1[2];
    public static void main(String[] args) {
        DeleteContact dc = new DeleteContact();
        dc.showDetail();
        dc.printDetail();
        dc.editDetail();
        dc.updateDetail();
        dc.deleteDetail();
        dc.FinalDetail();
    }

    private void showDetail() {
        for (int i = 0; i < c1Arr.length; i++) {

            Contact1 c = new Contact1();
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

    private void printDetail() {
        for (int i = 0; i < c1Arr.length; i++) {

            System.out.println(c1Arr[i].name);
            System.out.println(c1Arr[i].lastname);
            System.out.println(c1Arr[i].number);
            System.out.println(c1Arr[i].address);


        }

    }

    private void editDetail() {
        for (int i = 0; i < c1Arr.length; i++) {

            Contact1 c= new Contact1();
            System.out.println("Enter name to edit:");
            c.nametoedit = sc.nextLine();
            System.out.println("Enter lastname to edit :");
            c.lastnametoedit = sc.nextLine();
            System.out.println("Enter number to edit :");
            c.numbertoedit = sc.nextLine();
            System.out.println("Enter address to edit:");
            c.addresstoedit = sc.nextLine();
            c1Arr[i] = c;

        }

    }

    private void updateDetail() {
        for (int i = 0; i < c1Arr.length; i++) {
            System.out.println(c1Arr[i].nametoedit);
            System.out.println(c1Arr[i].lastnametoedit);
            System.out.println(c1Arr[i].numbertoedit);
            System.out.println(c1Arr[i].addresstoedit);

        }
        System.out.println("DETAILS UPDATED");
    }

    private void deleteDetail() {
    for (int i = 0; i < c1Arr.length - 1; i++) {
            c1Arr[i] = c1Arr[i++];
        Contact1 c= new Contact1();
            System.out.println("Enter name to delete:");
            c.nametodelete = sc.nextLine();
            System.out.println("Enter lastname to delete :");
            c.lastnametodelete = sc.nextLine();
            System.out.println("Enter number to delete :");
            c.numbertodelete = sc.nextLine();
            System.out.println("Enter address to delete:");
            c.addresstodelete = sc.nextLine();
        }
    }

    private void FinalDetail() {
        for (int i = 0; i < c1Arr.length - 1; i++) {
            c1Arr[i] = c1Arr[i++];
            System.out.println(c1Arr[i].nametodelete);
            System.out.println(c1Arr[i].lastnametodelete);
            System.out.println(c1Arr[i].numbertodelete);
            System.out.println(c1Arr[i].addresstodelete);
        }


        System.out.println("DETAILS DELETED SUCCESSFULLY");
    }
}





