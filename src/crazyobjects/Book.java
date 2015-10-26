package crazyobjects;

/**
 * Created by ryan on 2015-10-22.
 */
public class Book {
  public String title;
public String course;

public Book (String title, String course){
    this.title=title;
    this.course=course;
}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCourse(String course) {
        this.course = course;
    }
        public String toString() { 
        String bookStats = "The book's title is " + title + " and it is for " + course;
        return(bookStats);
    }
}
