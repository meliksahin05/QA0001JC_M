package d22Constructor_DateTime_PassByValues;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

         //DATE TIME, DATE DATA TYPE(CLASS)

        //Example; Print the local date on the console....
        //returns info in your computer  system.....

        LocalDate myDate = LocalDate.now();

        System.out.println("myDate = " + myDate); //2024-05-23

        System.out.println("LocalDate.now() = " + LocalDate.now());  //LocalDate.now() = 2024-05-23

        //Example2  Lets fetch only month element from date......

        System.out.println("myDate.getMonthValue() = " + myDate.getMonthValue()); //5
        //getMonthValue method returns int data type....

        //in java, Month is Enum type data...
        //Constant data(day names, month names, country name) is stored in Enum data.....

        //Catch the name of the month

        Month monthName = myDate.getMonth();
        System.out.println("monthName = " + monthName); //MAY
        System.out.println("myDate.getMonth() = " + myDate.getMonth()); //MAY


        //Example3  Lets fetch only year element from date......
        int year = myDate.getYear();
        System.out.println("year = " + year); //year = 2024

        //Example4; catch  the day of the month
        int  dayOfMonth  =myDate.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth); // dayOfMonth = 23

        //Example5; fetch dat of the week
       DayOfWeek  dayOfWeek = myDate.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek); //dayOfWeek = THURSDAY

        //Example6; How to go to a future time....

        //plusDays()===> It goes to future day based on the specified day number in method parentehsis....
        //plusMonths()===> It goes to future month based on the specified month number in method parentehsis....
        //plusYears()===> It goes to future years  based on the specified year number in method parentehsis....

       LocalDate futureDate = myDate.plusYears(-1).plusMonths(4).plusDays(4);

        System.out.println("futureDate = " + futureDate);  //futureDate = 2025-09-27

        //How to get the past
        //minusYears() ==> This subtracts the specified number from the year of local date or localdatetime....

        //minusMonths() ==> This subtracts the specified number from the months of local date or localdatetime....

        //minusDays() ==>  This subtracts the specified number from the days of local date or localdatetime....

        //get to past (1999, 01,14)

        LocalDate pastDate = myDate.minusYears(25).minusMonths(4).minusDays(9);

        System.out.println("pastDate = " + pastDate); //pastDate = 1999-01-14


        //How to create a specific date...
        //LocalDate.Of ==> allows us to create a specific data....

        LocalDate specificDate1 = LocalDate.of(2014,10,12);
        System.out.println("specificDate1 = " + specificDate1); //specificDate = 2014-10-12

        LocalDate specificDate2 = LocalDate.of(2024,01,12);
        System.out.println("specificDate2 = " + specificDate2); //specificDate2 = 2024-01-12

        //isAfter() ==> check a date is after another date....
        //isBefore ==> check a date is before another date....

        boolean isAfter = specificDate1.isAfter(specificDate2);
        System.out.println("isAfter = " + isAfter); //false

        boolean isBefore = specificDate2.isBefore(specificDate1);
        System.out.println("isBefore = " + isBefore); //false

        boolean isBefore1 = specificDate1.isBefore(specificDate2);
        System.out.println("isBefore1 = " + isBefore1); //true

        //Example; IF the date entered by user is past date, print "Invalid Date"
        //if user enters future date, print "You can reach the this time"

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter date components: year - month - day ");

        int yearComp = scan.nextInt();
        int monthComp = scan.nextInt();
        int dayComp = scan.nextInt();

        //Combine the data create a date in correct format.....

        LocalDate dateEntered = LocalDate.of(yearComp, monthComp,dayComp);

        System.out.println("dateEntered = " + dateEntered);

        if (dateEntered.isBefore(LocalDate.now())){

            System.out.println("Invalid Date");
        }else {
            System.out.println("You can reach this time. This is future...");
        }

        //Example Enter your birthdate and catch the day name of your birthday.....

        System.out.println("Please enter your birthdate");
        int y = scan.nextInt();
        int m  = scan.nextInt();
        int d = scan.nextInt();

       LocalDate birthday = LocalDate.of(y,m,d);

        System.out.println("My birthday day = " + birthday.getDayOfWeek()); //WEDNESDAY


    }
}
