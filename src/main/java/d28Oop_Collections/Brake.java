package d28Oop_Collections;

public interface Brake extends Engine {

     void abs(int a);

    /*
    An interface can be thought of as a "contract" that classes can implement

    An interface contains one or more abstract methods and specifies their signatures...
    (names and parameter) but does not define the implementation of these methods
    Classes implement these interfaces by defining these methods according ti their needs

    i) Methods inside an interface are automatically public.... So we dont write acces modifiers for creating methods innterface...
    when we creating methods in interfaces , we can not use final, static keyword.....
    Methods inside an interface are automatically "abstaract" so we don need to write the abstract....
    keyword and method body when creating (abstract) methods in interfaces....
    Note: by default methods are abstract and public interface....
    thats why interface is fully abstract structure.....
     */

    public final int price = 2000;
    void run();


    /*
    you can not create object from interfaces they are incomplete strutures because they do not have constructor)
    Interfaces can only be parents in the relationship with classes...
    interfaces are created to store things that must be done.....


     */

    /*    child         parent

         class           class     ==> extends
         interface       interface ==> extends
         class           interface ==> implements
         interface       class     ==> not possible***

         4) We can place methods with the same name in multiple interface parents
        like putting a run() method inside Motor, Air Conditioning, and Brake. When a child class overrides
        this method, it is unclear from which interface the method comes.

        5) Variables in interfaces are by default public static final. So, it is optional to write them.

        6) We can place variables with the same name in all interfaces. Since they are static and accessed
         through the interface, it is not a problem.

     */

    //What is the difference between abstract class and interface?

    /*
    Abstract class does not support multiple inheritance but in interface support multiple interfaces...
     Abstract classes can contain all types of variable but in interface must be final, static, public.....
     An interface cannot be a child of concrete class...
     Abstract classes have constructor but interface does not have constructor.....

     */







}
