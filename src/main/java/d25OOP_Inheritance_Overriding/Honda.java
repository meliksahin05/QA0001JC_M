package d25OOP_Inheritance_Overriding;

public class Honda extends Car {


    public Honda(){
//     super();
        System.out.println("Civic");
    }


/*
Question: So, when an object is created in a child class, how does the Parent recognize it and
execute its own constructor?

Answer: This is done with a super() call. The super call, in a child class's constructor,
is an expression used to call the parent class's constructor without parameter.

The super() call is automatically invoked when an object is created in a child class.
However, you can also manually invoke the super() call. To do this, you can use the super() expression
at the beginning of the child class's constructor. If you write it manually, you can also call
parameterized constructors.

Why make a super call?

Question: So, when an object is created in a child class, how does the Parent recognize it and
execute its own constructor?

Answer: This is done with a super() call. The super call, in a child class's constructor,
is an expression used to call the parent class's constructor without parameter.

The super() call is automatically invoked when an object is created in a child class.
However, you can also manually invoke the super() call. To do this, you can use the super() expression
at the beginning of the child class's constructor. If you write it manually, you can also call
parameterized constructors.

                    Why make a super call?
        1) If you use the super keyword, you can call the method of the parent class and also
        ...modify the behavior of this method according to the needs of the child class.
        2) The extends keyword only allows inheritance, but does not modify the methods of the parent class

*/




}
