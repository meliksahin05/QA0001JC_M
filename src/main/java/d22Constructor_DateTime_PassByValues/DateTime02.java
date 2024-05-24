package d22Constructor_DateTime_PassByValues;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {


        //How to catch the current time....

       LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime); //currentTime = 13:02:40.587478


        //Datetimeformatter is class allowing us to manipulate date and time formats....

        //ofPattern ==> allows us to create a pattern for date and time....

        //format() ==> we can convert LocalTime into the string with desired format.....

        //HH :mm ===> 24 Hours clock system
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH : mm"); //11 : 05
        System.out.println("dtf.format(currentTime) = " + dtf.format(currentTime));

        //hh :mm ===> 12 Hours clock system AM PM not shown

        DateTimeFormatter hoursSystemFor12 = DateTimeFormatter.ofPattern("hh :mm");

        System.out.println("hoursSystemFor12.format(currentTime) = " + hoursSystemFor12.format(currentTime));

        //hh :mm a ===> 12 Hours clock system AM PM format....

        DateTimeFormatter amPmFormat = DateTimeFormatter.ofPattern("hh :mm a");

        System.out.println("amPmFormat.format(currentTime) = " + amPmFormat.format(currentTime));


        //hh :mm : ss ===> it shows also seconds.....

        DateTimeFormatter seconds = DateTimeFormatter.ofPattern("hh :mm : ss");
        System.out.println("seconds.format(currentTime) = " + seconds.format(currentTime)); //11 :14 : 04

        //HH : MM ==> This is incorrect because java understand that "MM" is month.
        // if you see the minutes on the console you have to use "mm".....

        //formated date

         LocalDate currentDate = LocalDate.now();

        DateTimeFormatter cD1 = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");

       String formattedDate = cD1.format(currentDate);

        System.out.println("formattedDate = " + formattedDate); //May-24-2024


        // dd-MM-yyyy ==> day-month-year
        //MM ==> You will see the number of the month in the year
        //MMM ==> AUG
        //MMMM ==> AUGUST

        DateTimeFormatter cD2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        String formattedDate1 = cD2.format(currentDate);

        System.out.println("formattedDate1 = " + formattedDate1);


        //What is the time in Toronto ==> use the term "America/Toronto"

         LocalTime zoneIdForAmsterdam = LocalTime.now(ZoneId.of("America/Toronto")); //04:27:46.579017

        //What is the time in Amsterdam ==> use the term "Europe/Amsterdam"
        System.out.println("zoneIdForAmsterdam = " + zoneIdForAmsterdam); //10:25:43.613384

        //What is the time in New York?

        LocalTime zoneIdForNewYork = LocalTime.now(ZoneId.of("America/New_York"));

        System.out.println("zoneIdForNewYork = " + zoneIdForNewYork); //04:30:36.447784


        //Lets use date and time together

        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println("dateAndTime = " + dateAndTime); //2024-05-24T11:34:01.252700

        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MMMM-yyyy-HH :mm");

        System.out.println("dateTimeFormat.format(dateAndTime) = " + dateTimeFormat.format(dateAndTime)); //24-May-2024-11 :37



    }
}
