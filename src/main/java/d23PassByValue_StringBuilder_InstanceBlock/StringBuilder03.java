package d23PassByValue_StringBuilder_InstanceBlock;

public class StringBuilder03 {

    public static void main(String[] args) {

        //reverse() ==> reverses the content of the Stringbuilder object....
        //This method does not exist in the string class.....

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity()); //28

        //How to reverse data.....
        sb1.reverse();
        System.out.println("sb1 = " + sb1); //sb1 = ysae si avaJ

        //deleteCharAt(int index); //deletes the character at specified index number
        sb1.deleteCharAt(1); //
        System.out.println("sb1 = " + sb1); //yae si avaJ

        //delete(int start index(inclusive , int ending index(exclusive)

        sb1.delete(0,2);// deletes the characters from index 0 and index 1
        System.out.println("sb1 = " + sb1); //sb1 = e si avaJ

        StringBuilder sb2 = new StringBuilder("Java is easy");
        //replace(int start index(inclusive) , int ending index (exclusive) , String which data you wanna put)
        sb2.replace(0,4,"Phyton");
        System.out.println("sb2 = " + sb2); //sb2 = Phyton is easy

        //5 insert(int offset, String which data you wanna put)
        sb2.insert(6, "Money");
        System.out.println("sb2 = " + sb2);

        //CompareTo() method is used to compare two stringbuilder object......

//        StringBuilder sb3 = new StringBuilder("Bava");
//        StringBuilder sb4 = new StringBuilder("Lava");
//
//         int result = sb3.compareTo(sb4);
//        System.out.println("result = " + result); //-10

//        StringBuilder sb3 = new StringBuilder("Zava");
//        StringBuilder sb4 = new StringBuilder("Lava");
//
//        int result = sb3.compareTo(sb4);
//        System.out.println("result = " + result); //14

        StringBuilder sb3 = new StringBuilder("Lava");
        StringBuilder sb4 = new StringBuilder("Lava");

        int result = sb3.compareTo(sb4);
        System.out.println("result = " + result); //0

        // 6-compareTo() method is used to compare two StringBuilder objects.
// It returns an int value. It works like a dictionary.
// If two StringBuilder objects are equal, it returns 0.
// If the first StringBuilder object comes before the second StringBuilder object, it returns a negative value.
// If the first StringBuilder object comes after the second StringBuilder object, it returns a positive value.
// It gives the difference between the ascii codes of two different characters.


        //StringBuilder is not as rich as String class, for example there are no UppercaseMethod, split methods....

        //The toString() method converts the content of the stringbuilder object into a string container....
        String convertData = sb4.toString().toUpperCase();
        System.out.println("convertData = " + convertData); //LAVA

        //String convert to StringBuilder
        StringBuilder newStringBuilder = new StringBuilder(convertData);


        //StringBuffer
        StringBuffer sbf = new StringBuffer("Buffer");
        System.out.println(sbf);


        /*
    1) StringBuffer is another class in Java that produces Strings.
       StringBuffer is the first class created by Java to produce Strings.

    2) StringBuffer is very similar to StringBuilder, meaning both produce "mutable" (changeable) Strings.
    3) StringBuffer is "multi-threaded", but StringBuilder is not.
    4) Because StringBuilder is not multi-threaded, it operates faster than StringBuffer.
    5) In multi-threaded environments, the order of operations is important. Organizing operations in a logical
    sequence is called "synchronization".
       Since StringBuffer is multi-threaded, it is also synchronized.

    We have learned about three classes that create Strings;
    1) If an Immutable String is needed ==> String class
    2) For a Mutable String, use StringBuilder or StringBuffer
       a) Use StringBuilder when multi-threading is not needed
       b) Use StringBuffer when multi-threading is required
*/
        //difference between single thread and multi thread
        /*Simplicity and Predictability: A single thread makes the program simpler and more predictable. Therefore, using a
single thread is easier for small and simple applications.

Resource Control: A single thread makes it easier to keep certain resources (e.g., file access) under control. Using
multiple threads requires sharing and synchronizing resources, which can be more complex.

Performance Optimization: Some tasks may perform better with a single thread. Especially, CPU-intensive tasks may
benefit from a simpler single-thread approach. Also, when specific tasks need to be done sequentially, using a single
 thread makes sense.

Platform Independence: A single thread provides more consistent behavior across different operating systems and
platforms. Using multiple threads can introduce platform-dependent issues and behavior differences.

Data Integrity: A single thread can be more easily managed to maintain data integrity. Using multiple threads
requires careful attention to data integrity issues and the use of synchronization mechanisms.*/







    }
}
