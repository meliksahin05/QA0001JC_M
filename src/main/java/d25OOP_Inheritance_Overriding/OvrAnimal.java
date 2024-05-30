package d25OOP_Inheritance_Overriding;

public  class OvrAnimal {


    //OOP(Object-Oriented Programming Language)

    //It is the wat how various objects we see in real life are transferred into computer.....
    //For example: showing an objects color, state name, year of manufacture, among many other proporties

    /*
    Benefits of object oriented programming languge:

    1)Object creation is centralized with in a class...
    2)Due to classess being created once, it prevents the need to rewrite long codes, allowing operations....
    3)Preventing the rewriting of long codes shortens the development.....
    4)As objects are independent of each other...., it provides an advantage in terms of information confidentally...
    5)Changes can be made in a single class instead of making modifications across all projects through Classes....


    //We can examine OOP CONCEPT IN 4 FUNDAMENTAL CHARACTERS..
    1)Inheritance
    2)Polymorphisim(overloading , overriding)
    3)Encapsulation(Hidden data, private)
    4)Abstaction(abstract class, interface class)

     */

    //1) Inheritance
    //it is a concept that transfers properties from one class to other....
    // We use "extends" keyword in child class to inherit from parent...

    /*
    What are the benefits of Intheritance?
    1)it helps with code resublity.....
    2)Since there is no need to rewrite the main code, we can save time and effort by writing less code...
    3)Uptades can be easily made
    4)It reduces the size of classess (child classes will be automatic structure when we benefit inheritance)
    5)It leads to lower development and maintenance costs....
     */

     public void eat(){
        System.out.println("Animals eat");
    }

    public void drink(){
        System.out.println("Animals drink");
    }

    public void price(){
        System.out.println("Macbook price is 1000 Euro");
    }

//     public final String name = "melik";

//    final int age = 11;
//     age = 12;

//    public final int age;
//     age = age+5;
//

//2.Polymorphism:
//Method Overloading + Method Overriding

//It is the second principle of OOP. Polymorphism means having many forms.
//It is used to operate a method in different ways to get desired outcomes.

//There are two types.

// i.Method Overloading: We have seen this
//ii.Method Overriding - overwriting - invalidating - we will navigate among classes

//It is when the Child class uses the method in the Parent class by modifying it.

}
