package d22Constructor_DateTime_PassByValues;

public class CarRunner {

    public static void main(String[] args) {


        //4 Create an object/instance from car class....
//        Car c1 = new Car();
//
//        c1.action();
//        c1.stop();
//
//        System.out.println(c1.brand);
//        System.out.println(c1.engineType);
//        System.out.println(c1.model);
//        System.out.println(c1.year);
//        System.out.println(c1.sunroof);

        //5)get back to car class and create constructor.....

        //8) We entered the data into constructor parenthesis
        Car c1 = new Car("BMW", "X5",2023, "Benzin", false);

        c1.action();
        c1.stop();

        System.out.println(c1.brand);
        System.out.println(c1.engineType);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.sunroof);

        //9 Create one more object/instance
        Car c2 = new Car("Ford", "Ranger" , 2022,"Petrol" , true);
        System.out.println("c1+ =" + c1); //c1+ =Car{brand='BMW', model='X5', year=2023, engineType='Benzin', sunroof=false}
        System.out.println("c2+ =" + c2); //c2+ =Car{brand='Ford', model='Ranger', year=2022, engineType='Petrol', sunroof=true}


        //12 Create 3 more objects/instance...

        Car c3 = new Car("Mercedes","CLS200"); //String brand, String model)
        Car c4 = new Car("DIESEL");  //String engineType
        Car c5 = new Car(false);  //boolean true

        System.out.println("c3 = " + c3);  //c3 = Car{brand='Mercedes', model='CLS200', year=2024, engineType='Hybrid', sunroof=true}
        System.out.println("c4 = " + c4);  //c4 = Car{brand='Honda', model='Accord', year=2024, engineType='DIESEL', sunroof=true}
        System.out.println("c5 = " + c5); //c5 = Car{brand='Honda', model='Accord', year=2024, engineType='Hybrid', sunroof=false}


    }
}
