package d22Constructor_DateTime_PassByValues;

public class Car {

    //When we create a data structure or helper class, we dont need main method....
    //But if we develop an independent program, we might need to create main method....
    // in real projects, there are going to be many classess and there will be on single class with main method....
    //And "Runner" name is appended to class name to class with main method.


     //1) Lets create variables (passive characteristics)
          public String brand = "Honda";

          String model = "Accord";

          int year = 2024;

          String engineType = "Hybrid";

          boolean sunroof = true;


          //2Lets create some methods (active characteristics)

            public void action (){

                System.out.println(brand + " reaches 100km/h in 10 seconds");
            }

            public void stop(){

                System.out.println(brand + " stop in 20 meters at maximum speed");

            }

            //3) Then create main method in Car Runner class.....


            //6  Create a constructor for car class....
            //   What is consturctor?
            /*
            It is a structure allowing us to create instance/object from class....
            //When we create a class, java is creating constructor in background automatically....
            This constructor named is "Default Constructor"
            default constructor ==> Car()

              But in the scenario in notes above, class will give us same data all the time...
              We can assign the new data by the way. So we create our constructor for class and
              Java deletes default constructor which is creating by automatically.....
             */


             //Create constructor here...
             //access modifier + Class name () + {}

    //String brand ==> Honda
    //String model ==> Accord
    //int year    ==> 2024
    //String engineType
//  boolean sunroof

          public  Car (String brand, String model , int year ,String engineType, boolean sunroof) {

               this.brand = brand;  // we will assign the new data to local "brand" variable (this.brand)
               //new data will be assigned from Runner class by using class constructor and parameter....
               this.model = model;
               this.year = year;
               this.engineType = engineType;
               this.sunroof = sunroof;
           }




           //7)Go to runner class and enter 5 different parameters in the parenthesis of constructor...

          //11) Create three more constructor.....

          public Car(String brand, String model){  //Right click and then click "Generate" then click "Constructor" then you can choose parameters
              this.brand = brand;
              this.model = model;

          }

          public Car(String engineType){
               this.engineType = engineType;
          }

          public Car(boolean sunroof){
              this.sunroof = sunroof;
          }


    //10 we are getting references when you create two objects without toString...
          // To handle we have to use toString Methods.....

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engineType='" + engineType + '\'' +
                ", sunroof=" + sunroof +
                '}';
    }



}
