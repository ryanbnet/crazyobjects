package crazyobjects;

public class Student
{
    private int stuNumber;
    private String name;
    public Jacket myJacket;

    public Locker myLocker;
    public Book[] books;

    public Student(String name, int stuNumber){
        this.name = name;
        this.stuNumber = stuNumber;
        myLocker = new Locker(this, this.stuNumber); //Creates a locker for the student
        myJacket = new Jacket(this); //Creates a jacket for the student
    }

    //Prints out why the student was sent to the office
    public void sendToOffice(String reason){
        System.out.println(name + " was sent to the office: " + reason);
    }

    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }



} // end Student class
