package d39Lambda;

public class Course {


    // Scenario: Let's learn to use lambda with objects.
    // Create active and passive properties within the class

    /*
        A class that contains
        1) private variables (encapsulation)
        2) parameterized and no-argument constructors
        3) getters -To access private variables-
        4) setters -To modify private variables-
        5) toString() method -To return the content of the object in a readable format-
        is called a POJO class.

        POJO ==> Plain Old Java Object

        In many applications, POJO classes are used to transport data from one layer to another. (API)
    */

    private String season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;




    public Course(String season, String courseName, int averageScore, int numberOfStudents){

        this.season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;


    }

    public Course() {
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", averageCourse=" + averageScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
