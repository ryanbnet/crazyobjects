package crazyobjects;

import java.util.ArrayList;

public class ClassRoom {
    private String course;
    private String teacher;


    public ClassRoom (String course, String teacher){
        this.course = course;
        this.teacher = teacher;
    }

    public boolean enterClass(Student student){

        System.out.println(student.getName() + " came to class " + course + " taught by " + teacher);
//Creates a list of all the names of the student's books
        ArrayList<String> books = new ArrayList();
        for (Book i : student.books){
            books.add(i.getCourse());
        }

        //If student meets all the classroom criteria, they are let into class
        if (student.myLocker != null && student.myLocker.checkJacket() != null && student.books.length > 0 && books.contains(this.course)){
            return true;
        } else {
            //The student is told why they are not let into class
            if (student.myLocker == null){
                student.sendToOffice("Get a locker");
            } else if (student.myLocker.checkJacket() == null){
                student.sendToOffice("Put your jacket in your locker");
            } else if (student.books.length <= 0){
                student.sendToOffice("You have no books");
            } else if (!books.contains(this.course)){
                student.sendToOffice("Get the correct book");
            }
            return false;
        }
    }
}
