package d27OOP_Collections;

public class HondaRunner {

    public static void main(String[] args) {


//        Honda h = new Honda(); //You can not create an object from the abstract class.....
//        h.music();

        Civic c = new Civic();
        c.engine();
        c.window();

        Accord a = new Accord();
        a.engine();
        a.window();



    }
}
