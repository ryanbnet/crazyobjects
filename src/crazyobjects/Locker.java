package crazyobjects;

public class Locker {
    private int number;
    private Student owner;
    private Jacket studentJacket;
    public Book[] books;

    public Locker(Student owner, int number){
        this.owner = owner;
        this.number = number;
        studentJacket = null;
    }
//Returns the jacket which is in the locker, or null if there is none
    public Jacket checkJacket(){
        return studentJacket;
    }

//Student puts their jacket into the locker, losing it in the process
    public void putJacket (){
        studentJacket = owner.myJacket;
        owner.myJacket = null;
    }
    //Owner takes the jacket out of the locker
    public void takeJacket(){
        owner.myJacket = studentJacket;
        studentJacket = null;
    }


    public String toString(){
        return "Number: " + number + " Owner: " + owner.getName() + " Books: " + books.toString();
    }
}
