package d33Exceptions_Enum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions09 {
    public static void main(String[] args) {

        //Lets create previous practice with try -catc in this class unlike method level exception throwing....


         try{
             FileInputStream fis = new FileInputStream("src/main/java/d32Exceptions/file.txt");
             //what if there is no file in the root, you will get exception(fileinputnotfound exception)


             int k = 0;


             //When text is over to read in file, asci value will return -1
             while ((k=fis.read())!=-1) {


                 System.out.print((char) k);
             }

         }catch (IOException ioe){
                 System.out.println(ioe.getMessage());
             }

         }

    }


