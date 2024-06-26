package d39Lambda;

import java.util.ArrayList;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {


     Course courseTrDay = new Course("Summer", "TR DAY", 97, 130);
     Course courseTrNight = new Course("Winter", "TR NIGHT", 95, 110);
     Course courseEngDay = new Course("Spring", "ENG DAY", 93, 125);
     Course courseEngNight = new Course("Winter", "ENG NIGHT", 98, 145);


     List<Course> courseList = new ArrayList<>();
     courseList.add(courseTrDay);
     courseList.add(courseTrNight);
     courseList.add(courseEngDay);
     courseList.add(courseEngNight);

        System.out.println("courseList = " + courseList);


            /*
        [Course{season='Summer',courseName='TR Day',    averageScore=97, numberOfStudents=130},
        Course{season='Winter', courseName='TR Night',  averageScore=95, numberOfStudents=110},
        Course{season='Spring', courseName='ENG Day',   averageScore=93, numberOfStudents=125},
        Course{season='Winter', courseName='ENG Night', averageScore=98, numberOfStudents=145}]
         */

        //1) check if all "averageScore" are greater than 91
        // allMatch method works with lambda

        boolean result = courseList.stream().allMatch(t-> t.getAverageScore()>100);
        System.out.println("result = " + result);


    }
}
