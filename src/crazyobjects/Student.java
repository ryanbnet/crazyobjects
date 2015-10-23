package crazyobjects;

import java.util.ArrayList;

public class Student
{
    private int stuNumber;
    private String name;
    private Jacket myJacket;

    public Locker myLocker;
    public Book[] books;

    public Student(String name, int stuNumber){
        this.name = name;
        this.stuNumber = stuNumber;
    }

    public void sendToOffice(String reason){
        System.out.println(name + " was sent to the office: " + reason);
    }

    public String toString(){
        return "Name: " + name + " Number: " + stuNumber + " Locker: " + myLocker.getNumber() + " Books: " + books.toString();
    }

    public String getName() {
        return name;
    }

} // end Student class
