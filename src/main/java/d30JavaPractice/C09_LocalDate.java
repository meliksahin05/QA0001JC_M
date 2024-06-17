package d30JavaPractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C09_LocalDate {

    public static void main(String[] args) {

        /*
    - Ali was born 45 years, 8 months, and 5 days after 29.10.1923.
    - Veli was born 24 years, 2 months, and 11 days before 15.09.1993.
    - Calculate and print the birth dates of Ali and Veli.
    - Print Ali's birth date in the format DD/MM/YY.
    - Write a code to check if Ali and Veli's birth dates are the same.


*/

        //Calculate and print the birth dates of Ali and Veli.....
        LocalDate ali = LocalDate.of(1923,10,29).
                plusYears(45).plusMonths(8).plusDays(5);

        LocalDate veli = LocalDate.of(1993, 9,15).
                minusYears(24).minusMonths(2).minusDays(11);

        System.out.println("ali = " + ali); //ali = 1969-07-04
        System.out.println("veli = " + veli); //veli = 1969-07-04

        //Format
         DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("ali's bith date = " + ali.format(formatter));  //ali's bith date = 04/07/69


        //check if birth dates are same
        if (ali.equals(veli)){

            System.out.println("They born on same date");
        }else{
            System.out.println("Different Date");
        }

        boolean isSame = ali.equals(veli);
        System.out.println("isSame = " + isSame);
        System.out.println("ali = " + ali);
        String newFormatForAli = ali.format(formatter);
        System.out.println("newFormatForAli = " + newFormatForAli);

       LocalDate zakir = LocalDate.of(1980,2, 17);

    int Aliyear =  ali.getYear();
    int ZakirYear = zakir.getYear();
    int differencebet = ZakirYear - Aliyear;


    LocalDate zakirNewAge = zakir.minusYears(differencebet);
        System.out.println("zakirNewAge = " + zakirNewAge);


    }
}

