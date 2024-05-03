package d12StringManipulation;

public class StringManipulation02_IndexOf {

    public static void main(String[] args) {


        //Example Print unique characters in given String data on the console

        //Alabama ===> A,l,b,m

        String str = "Alabama";


        if (str.indexOf("A") == str.lastIndexOf("A")){

            System.out.print("A");
        }

        if (str.indexOf("l") == str.lastIndexOf("l")){

            System.out.print("l");
        }

        if (str.indexOf("a") == str.lastIndexOf("a")){

            System.out.print("a");
        }

        if (str.indexOf("b") == str.lastIndexOf("b")){

            System.out.print("b");
        }

        if (str.indexOf("a") == str.lastIndexOf("a")){

            System.out.print("a");
        }

        if (str.indexOf("m") == str.lastIndexOf("m")){

            System.out.print("m");
        }
        if (str.indexOf("a") == str.lastIndexOf("a")){

            System.out.print("a");
        }

        System.out.println("===========================================================");


        //Example2 ; Convert all digits into "*" in a card number except last digits.....
        // 1234 6789 1234 6789 ====> **** **** **** 6789

        String cardNum = "1234 6789 1234 6789";


        String firstPart = cardNum.substring(0,cardNum.length()-4).replaceAll("[0-9]", "*");
        System.out.println("firstPart = " + firstPart);


        String lastPart = cardNum.substring(15);

        String result = firstPart+lastPart;

        System.out.println("result = " + result);

        System.out.println("=========");
        char c = 'A';

        c++;

        System.out.println( c );




    }
}
