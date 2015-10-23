package crazyobjects;

import java.util.ArrayList;

public class Student
{
    private int stuNumber;
    private String name;
    private Locker myLocker;
    private Jacket myJacket;
    public ArrayList<Book> myBooks = new ArrayList();

    public Student(String name, int stuNumber){
        this.name = name;
        this.stuNumber = stuNumber;
    }

    public void sendToOffice(String reason){
        System.out.println(name + " was sent to the office: " + reason);
    }

    public String toString(){
    }
} // end Student class
