package d35Enum_Iterator_Lambda;

import java.util.Scanner;

public class EnumRunner {

    public static void main(String[] args) {


//        Cities c = new Cities(); we can not create an object from enum......


        //1) Reach out to constant in enum
        Cities c = Cities.İSTANBUL;
        System.out.println(c); //İSTANBUL

        //2) reach out to the CityName of constant data....
          String city = Cities.BURSA.getCityName();
        System.out.println("city = " + city); //city = Bursa

        //3 reach out to the PlateCode of constant data
       int pcode = Cities.ADANA.getPlateCode();
        System.out.println("pcode = " + pcode); // pcode = 1

        //4 reach out to the postalCode of constant data

       String postalCode = Cities.ANKARA.getPostalCode();

        System.out.println("postalCode = " + postalCode); //postalCode = 06000


        //Ask user to enter plate code of city, and print city name on the console....



         Cities [] cityInTurkey    = Cities.values();


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter plate code");
        int plate = scan.nextInt();

        if (plate < 1 || plate >81){

            System.out.println("Invalid plate code");

        }else {

            for (Cities w:cityInTurkey) { //1, "Adana", "01000"  , 2, "Adıyaman", "02000"),

                if (plate == w.getPlateCode()){

                    System.out.println("The plate code you entered belong to " + w.getCityName()); //The plate code you entered belong to Adana


                }



            }


        }


    }
}
