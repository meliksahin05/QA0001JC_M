package d30JavaPractice;

public class C10_StringBuilder {

    /*
    - Create a StringBuilder object with a capacity of 7.
    - Print the Capacity and Length values.
    - Append the string "hava güzel" to this object and print it.
    - Remove the space in the middle.
    - Reverse the data.
    - Delete the last 4 characters of the data.
    - Reverse the data again.
    - Append the string first  "Java " to the data.
*/
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(7);

        //- Print the Capacity and Length values.
        System.out.println("sb.capacity() = " + sb.capacity()); //sb.capacity() = 7
        System.out.println("sb.length() = " + sb.length()); //sb.length() = 0

        // - Append the string "hava güzel" to this object and print it.
        sb.append("hava güzel");
        System.out.println("sb = " + sb); //sb = hava güzel


        //- Remove the space in the middle.

        int idx = sb.indexOf(" ");
        sb.deleteCharAt(idx);
        System.out.println("sb without space = " + sb); //sb without space = havagüzel

        //- Reverse the data.
        sb.reverse();
        System.out.println("sb reversed = " + sb); //sb reversed = lezügavah

        // - Delete the last 4 characters of the data.
        sb.delete(sb.length()-4,sb.length());

        System.out.println("sb deleted last 4 ch = " + sb); // sb deleted last 4 ch = lezüg

        //- Reverse the data again.
        sb.reverse();
        System.out.println("sb reversed one more time = " + sb); // sb reversed one more time = güzel

        //- Append the string "Java " to the data.

        sb.insert( 0, "Java ");
        System.out.println("new one for sb = " + sb); //new one for sb = Java güzel


    }



}