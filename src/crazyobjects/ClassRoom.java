package crazyobjects;

import java.util.ArrayList;

/**
 * Created by ryan on 2015-10-22.
 */
public class ClassRoom {
    private String course;
    private String teacher;

    public ClassRoom (String course, String teacher){
        this.course = course;
        this.teacher = teacher;
    }

    public boolean enterClass(Student student){

        ArrayList<String> books = new ArrayList();
        for (Book i : student.books){
            books.add(i.getName());
        }

        if (student.myLocker != null && student.myLocker.checkJacket() != null && !student.books.isEmpty() && books.contains(this.course)){
            return true;
        } else {
            return false;
        }
    }
}
