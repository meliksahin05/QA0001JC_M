package d27OOP_Collections;

public abstract class Honda {

    //4.ABSTRACTION
    //Abstaraction consist of two parts

    /*

    Abstract class:
    Object can not be created directly from it. We create some classes not for the purpose of creating objects....
   but to categorize objects and to determine general characteristics....


     */
    public void music(){

        System.out.println("Pro system");
    }

    public abstract void engine (); // abstract method is the method without body.(incomplete method)

    public abstract void window();

    //Inheritance ==> Overriding ===> Abstraction

    /*

    1)Abstract methods do not have a body.... They tell you what is done, not how it's done....
    2)Methods with body are called "concrete methods or non-abstract methods"
    3)Abstract methods must be overriden, meaning they must be used by all child classes(required)
    4)Abstract methods can only be created within abstract classes....
    5) Abstract classess can contain both "abstract methods and concrete methods....
    6) Concrete methods can be overriden...
    7) final methods can not be overriden. Because it has the final value and you can not change the value in child class...
    8) An abstract class can not be private;  otherwise its children would not able to access and ovveride the method...

    9)An abstract class can have an abstract child class, and absract child class is not required to override the methods of its parent,
     but it can if it wants to...


































     */




}
