package crazyobjects;

import java.util.ArrayList;

/**
 * Created by ryan on 2015-10-22.
 */
public class Locker {
    private int number;
    private Student owner;
    private Jacket studentJacket;
    public Book[] books;

    public Locker(Student owner, int number){
        this.owner = owner;
        this.owner.myLocker = this;
        this.number = number;
    }

    public Jacket checkJacket(){
        return studentJacket;
    }

    public void putJacket (Jacket myJacket){
        studentJacket = myJacket;
    }

    public String toString(){
        return "Number: " + number + " Owner: " + owner.getName() + " Books: " + books.toString();
    }


    public int getNumber() {
        return number;
    }
}
