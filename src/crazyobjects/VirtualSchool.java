package crazyobjects;


public class VirtualSchool {

    /**
     * Demo test driver for the Crazy Objects problem You may change this class
     * to add your own tests
     */
    public static void main(String[] args) {   // Create a student and display
        Student me = new Student("Shanpei", 1234);
        System.out.print("Student: ");
        System.out.println(me);


        // Create Student's classes
        ClassRoom ics4u = new ClassRoom("ICS4U", "Ms. Hideg");
        ClassRoom sph4u = new ClassRoom("SPH4U", "Mr. Strict");

        //Create Books for classes

        Book ics4uBook = new Book ("ICS4U");
        Book sph4uBook = new Book ("SPH4U");

        //Put books in Student's locker

        me.myLocker.books = new Book[2];

        me.myLocker.books[0] = ics4uBook;
        me.myLocker.books[1] = sph4uBook;

        // Retrieve books from locker needed for classes

        me.books = new Book[2];
        for (int i = 0; i < me.myLocker.books.length; i++) {
            if (me.myLocker.books[i].course.equalsIgnoreCase("ICS4U")) {
                me.books[i] = me.myLocker.books[i];
                me.myLocker.books[i] = null;
            } else if (me.myLocker.books[i].course.equalsIgnoreCase("SPH4U")) {
                me.books[i] = me.myLocker.books[i];
                me.myLocker.books[i] = null;
            } else {
                if (i >= me.books.length) {
                    break;
                } else {

                    me.books[i] = new Book();
                    me.books[i].setTitle("Random");
                    me.books[i].setCourse("No course");

                }

            }
        }

        //Put away Jacket
        me.myLocker.putJacket();


        // Attempt to enter the classroom of Mr. Strict

        if (ics4u.enterClass(me) == true) {
            System.out.println(me + " was allowed into class.");
        } else {
            System.out.println(me + " was not allowed into class.");
        }

        System.out.println();

        // Attempt to enter the classroom of Mr. Strict

        if (sph4u.enterClass(me) == true) {
            System.out.println(me + " was allowed into class.");
        } else {
            System.out.println(me + " was not allowed into class.");
        }

    } // end main method
} // end VirtualSchool class
