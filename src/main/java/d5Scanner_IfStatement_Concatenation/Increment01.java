package d5Scanner_IfStatement_Concatenation;

public class Increment01 {

    //type main method
    public static void main(String[] args) {


        //INCREMENT

        //Example
        int a = 5; //Could you pleaase increase value of a by 2 and uptade existing container???

        a = a + 2; //longer sytax because we use "a" three times
        System.out.println("Original = " + a);

        // a = a+2 ==> Longer Sytanx of increasing value in the same container;

        a += 2; //shorter sytanx of increasing value in the same container

        System.out.println("Lets see the shorter sytanx of increasing value ; " + a);//9

        //DECREMENT

        int c = 15; //could you pls decrease by 3?
        System.out.println("Original one ; " +c);//15

        c = c - 3; //12 this one is longer snytax

        System.out.println("Longer one ; " + c);//12

        c -=3;
        System.out.println("Shorter one... Decreased = " + c); //9

        //MULTIPLICATION
         int b = 6;
         //multiply by 3
        b = b*3;
        System.out.println("THE LONGER SYNTAX OF B ; " +b); //18

        //Shorter one
        b *=3;

        System.out.println("This is shorter Syntax of b :" + b); //54

        //DIVISION
        //Decrease by Division

        int x = 24;
        x = x / 2; //longer one of x

        System.out.println("This is longer syntax of x ; " + x); //12

        //Shorter

        x /=2;
        System.out.println("This is shorter syntax of x ; " + x ); //6


        //Increase by 1

        int f = 19;
        System.out.println("Original of F : " + f); //19

        f = f+1;
        System.out.println("Longer syntax of F ; " + f); //20

        f += 1;
        System.out.println("Shorter syntax of F :" + f); //21

        f++;
        System.out.println("Shortest one F :" + f); //22

        //Decrease by 1

        int g = 19;
        System.out.println("Original of G : " + g); //19

        g = g-1;
        System.out.println("Longer syntax of G ; " + g); //18

        g -= 1;
        System.out.println("Shorter syntax of G :" + g); //17

        g--;
        System.out.println("Shortest one G :" + g); //16



        //POST INCREMENT( i++) ,  PREINCREMENT (++i)


        int i = 10;

        System.out.println("Original i :" + i);

        int k = i++;  //Do assignment first then do increment


        System.out.println("k : " +k); //
        System.out.println("i :" +i); //

//        int h = 1;
//        System.out.println("h = " + h);
//
//        h++;
//        System.out.println("h = " + h);
//
//        h++;
//        System.out.println("h = " + h);
//
//        h++;
//        System.out.println("h = " + h);
//
//        h++;
//        System.out.println("h = " + h);
//
//        h++;
//        System.out.println("h = " + h);
//
//        h++;
//        System.out.println("h = " + h);
//
//        h++;
//        System.out.println("h = " + h);
//
//        h++;
//        System.out.println("h = " + h);
//
//
//        for(int melik = 1; melik <11 ; melik+=3){
//            System.out.println("melik = " + melik);
//        }


        System.out.println("==================== PRE INCREMENT ==========================");


        //PRE INCREMENT (++i)

        int m = 21 ;
        System.out.println("Original  m :" + m);

        int n = ++m;   //Java understand that firstly do increment, then do the assignment

        System.out.println("n ; " + n); //22
        System.out.println("m ; " + m); //22

       long mm = 123;



    }
}
