package d27OOP_Collections;

public class Student {

    /*
    1) ENCAPSULATION IS INTENDED FOR THE PROTECTION AND HIDING OF DATA... BY USING ENCAPSULATION, WE CAN DEFINE

    READ(GETTER) AND WRITE(SETTER) PROPERTIES

    2) We can read access to some, and write acces to others.....

    For Example: an employee enters price information into a report- write
    but should not see report result...
   (company profit or loss)...


     */

//    public String name = "Martin Henry";


    //How can data be encapsulated?
    //by making access modifier private. Data will be hidden from all other classes.

    //How can we read the encapsulated daata?
    //By creating getter method, we can read the encapsulated data....

    public  String name = "Martin Henry";

    private int age = 13;

    private boolean isSuccessfull = true;

    private int engine = 2;

    //getter For name
    public String getName(){

        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsSuccessfull() {
        return isSuccessfull;
    }

    //Create setters to make data available to write

    public void setName(String name){

        this.name = name;


    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsSuccessfull(boolean Issuccessfull) {
        isSuccessfull = Issuccessfull;
    }

    //Setter methods do not produce new data, instead of they modify existing data on the object....
    //therefore return type of setters should be always void (Exception; API VERSION)
    //Setter methods takes parameters as they perform the assignment to private elements...
    //getter and setter are generally non-static....
    //becuase they are based on object oriented logic...

    // Shortcut to create setter and getter methods ====> right click + generate + setter and getter.....

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
}
