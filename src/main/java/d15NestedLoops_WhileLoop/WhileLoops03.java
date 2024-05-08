package d15NestedLoops_WhileLoop;

public class WhileLoops03 {

    public static void main(String[] args) {


        //Example; Create java application to checkif the given number is pallindrome or not

        //121 ==. 121   123321==> 123321   303===>303

        int x = 123321;

        //1) convert int to String

        String xStr = String.valueOf(x);
        System.out.println("xStr = " + xStr);

        String reverse = ""; //to store data in reverse process


        //2)starting value
        int i = xStr.length()-1; //dynamic last index

        while(i>=0) {

            reverse = reverse + xStr.charAt(i);



            i--;
        }

        System.out.println("reverse = " + reverse);

        if (xStr.equals(reverse)){

            System.out.println("This number is Pallindrome");
        }else{
            System.out.println("This number is not Pallindrome");
        }

    }
}
