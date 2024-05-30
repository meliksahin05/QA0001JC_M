package d25OOP_Inheritance_Overriding;

public class Car extends Vehicle{

    public String model = "Accord";
    public int year = 2020;


    //Lets create a constructor...
    public Car(String type){
        super("Acura",2024,"gas");
        System.out.println(type);

    }


    public Car(){
        this("used this keyword"); //"this" keyword means that use methods in this class.....
        System.out.println("H-Pack");
    }

//    public Car(String fuelType, String model){
//        super();
//        System.out.println("This is new car");
//    }



}
