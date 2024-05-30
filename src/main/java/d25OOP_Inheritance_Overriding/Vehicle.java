package d25OOP_Inheritance_Overriding;

public class Vehicle {

    //Notes
    /*
    Java does not support multiple inheritance. It supports "Single Inheritance"
    Inheritance structures created with ine parent and multiple children are called.....

     "Hierarchical Inheritance" and java supports this....

     We can inherit like an apartment building on flat per floor...
     We can name it Multi Level Inheritance

     In java the relationship from parent to child is called HAS-A relationship (top to bottom)
     In java the relationship from child to parent is called IS-A relationship (bottom to top)

 In Java, every class has one default constructor, but this default constructor
       is not visible inside the class because the default constructor is in the "Object Class".
       (for example, the animal class's () constructor seems not to exist, but it's in Object)

     */

    public Vehicle(){

        System.out.println("Honda, 2024, Diesel");
    }

    public Vehicle(String brand, int year, String engine){
        System.out.println(brand + ", " + year + ", " + engine);
    }

/*
Constructor Hierarchy

When you create an object from a child class, the constructors are executed from topmost parent class downwards



Imagine you are an automobile manufacturer producing different types of automobiles.

    1- Grandparent Class(Vehicle): This class contains the basic features of all automobiles.
    For example, common features like the brand, model, and fuel type of the automobiles are defined here.
    This class has a constructor, and when a new automobile is created, this constructor is called.
    This constructor sets up the basic features of the automobile.

    2- Parent Class(Car): This class extends the Grandparent class and represents more specialized types of automobiles.
     For example, features of sedan or h-pack automobiles could be defined here.
     The constructor of the Parent class sets both its own features and those of the inherited Grandparent class.

    3- Child Class: This class extends the Parent class and represents an even more specific type of automobile,
    for example, sports cars. The constructor of the Child class sets up its own features as well as those
    inherited from the Parent and Grandparent classes.

    **The constructors run downwards from top to bottom

    Result: Each class represents a more specialized type of automobile and inherits the features of its
    superclass while adding its own specific features.
*/


}
