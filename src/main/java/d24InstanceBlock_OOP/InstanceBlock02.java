package d24InstanceBlock_OOP;

public class InstanceBlock02 {

    // if you have the same codes to be executed in the constructors,
    //we move all the codes to instance block of the class...


     int year;


     //1.First instance block
    {
        System.out.println("Hello, enjoy your driving");

    }


    public InstanceBlock02(){

//        System.out.println("Hello, enjoy your driving"); // Move to instance block, this is not instance block here
    }

    public InstanceBlock02(int year){

        System.out.println(year);
        this.year = year;

    }

     String color;
     String fuelType;


     //2.INSTANCE BLOCK
    {
      color = "Black";
      fuelType ="Diesel";
        System.out.println("color = " + color);
        System.out.println("fuelType = " + fuelType);

    }


    public InstanceBlock02(String color, String fuelType){
        this.color =color;
        this.fuelType = fuelType;
        System.out.println(color + " and " + fuelType);




    }

}
