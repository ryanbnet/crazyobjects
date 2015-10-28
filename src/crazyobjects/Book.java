package crazyobjects;

public class Book {
    public String title;
public String course;

    public Book(){}

public Book (String title){
    this.title=title;
    this.course=title;
    //Since the course of the book will be the same as its title, there is only 1 variable needed
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

    public String getCourse() {
        return course;
    }
}
