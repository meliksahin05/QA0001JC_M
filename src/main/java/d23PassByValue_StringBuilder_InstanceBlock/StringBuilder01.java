package d23PassByValue_StringBuilder_InstanceBlock;

public class StringBuilder01 {
    public static void main(String[] args) {


        //String builder is a subclass of string
        //The StringBuilder class is also a class that produces Strings....
        //We use "String" class to create Strings....
//    Why did java also create the stringbuilder?
        //The string class produces "immutable(unchangeable)" strings
        /*
        While the stringbuilder class produces "mutable(changeable)" String.
        Being "immutable " means preserving the orginal value, being unchangeable..
        BEING "MUTABLE" MEANS THE ORGINAL VALUE CAN BE CHANGED...
        THEREFORE   WHEN YOU NEED TO FREQUENTLY ADD, REMOVE, OR MODIFY TEXT,
        WE ARE USING STRINGBUILDER
        USING STRINGBUILDER CAN BE A MORE EFFICIENT AND PERFOMANCE OPTION
        STRINGBUILDER INCLUDES VARIOUS METHODS AND FUNCTIONS FOR ADDING, REMOVING, CHANGING, OR REVERSING DATA....
        AMONG THESE ARE COMMONLY USED METHODS LIKE APPEND, DELETE, INSERT AND REPLACE......
         */


        //String(immutable(unchangeable)....
        String s = "Java";
        String t = s + "x";
        String w = t + "?";

        String c1 = "Tom";
        String c2 = "Tom";
        //Above there are two addresses for different data, but in string pool they have same value, so it stores one area in the heap memory....

        String c3 = new String("Tom"); //This is definifitely placed out of string pool bcs of "new" keyword....



        //StringBuilder(Mutable-Changeable)
        StringBuilder sb1 = new StringBuilder("Pyhton");


        System.out.println("sb1 = " + sb1);
        sb1.append("!");
        sb1.append("M");
        System.out.println("sb1 = " + sb1);

         //Example; whenn i assignconcatenated data into existing container, what happens to original data....

        String a = "Money";
             a = a + "More";



    }
//
//    1) If you assign a String to the same String variable after modifying it, Java creates a new container.
//2) The modified value is placed inside this new container,
//    and the pointer that was pointing to the old container is redirected to the new container.
//3) Consequently, the old container becomes addressless and is deleted by the "Garbage Collector" which removes
//    containers without addresses. GC prevents memory leaks. GC is a key feature that makes Java a safe and efficient
//    language for many applications. Data does not linger(stay) in memory unowned and insecurely.
//            4) The timing of the GC's operation is completely controlled by the JVM (Java Virtual Machine) and is independent of
//    the application.
//            */
//
//    //The append() method is used to add a new String to the StringBuilder object
//    //The capacity() method indicates the size of the allocated and yet unused space characters...




}
