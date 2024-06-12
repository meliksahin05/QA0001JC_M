package d32Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Exceptions08 {

    public static void main(String[] args) throws IOException {

        /*
        1) Exceptions encourented after pressing the run button are called Run time exceptions...
           such as Arithmetic Exception,
           NullPointer Exception,
           Stringoutofbound exception

           Run time exceptions are also referred to as "Unchecked exception" (not checked before pressing run button)


        2) There are also exceptions that are indicated by red underlines while writing code
           These are called "Compile time exceptions"
           and compile time exceptions are also known as "checked exceptions"...
           (there is a check before pressing the run button)
         */

        /*
        Explanaition; we used FileInputStream. It is a class. FileInputStream class is used in java to read files in byte format.
        it is part of java's java.io packagage.
        it is commonly used to read file types like text files, images, audio files etc..

        Note: in the asci table "A" or any other character is equvalent to 1 byte.....

         */


        FileInputStream fis = new FileInputStream("src/main/java/d32Exceptions/file.txt");
        //what if there is no file in the root, you will get exception(fileinputnotfound exception)


        int k = 0;


        //When text is over to read in file, asci value will return -1
        while ((k=fis.read())!=-1){




            System.out.print((char) k);// i used type casting to convert ascii value into the character.....

            //The read() method reads one byte from the file (returning its integer-ASCII value -0 to 255)
            //If the file contains the character 'A', the read() method will return a value of 65.
            //If the file contains the character 'a', the read() method will return a value of 97.
            //-1 is considered as the end of the file (EOF).
            //read returns -1 when it reaches the end of the file.
        }

        }


    }

    //What are the differences between throw and throws?
    /*
    1) "throw" is used within the method body,
    but throws is used after method parentesis(it is like method signature)
    2) throw can be written and used wherever desired within method body, as many time as needed.
    throws is written immediately after the method signature and only once....
    3) after throw, the "new" keyword and a constructor are used to create object....

    After "throws" only the exception class name is written....
    4) throw is used to throw an exception under certain conditions...(we set a condition that age cannot be negative)

    while throws is used to indicate that method can throw a certain exception........

     */


