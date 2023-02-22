package org.example.objects;

public class ClassRoom {

    Student student1=new Student();

    public static void main(String[] args) {
        int a=1;
        ClassRoom classRoom = new ClassRoom();
        classRoom.printObject();

        classRoom.populateObject();

        classRoom.printObject();
    }
    //private - > same class
    private void populateObject() {
        student1.id=1;
        student1.name="rahul";
        student1.setLastName("kumar");
    }

    private void printObject() {
        student1.printMyDta();
    }
}

