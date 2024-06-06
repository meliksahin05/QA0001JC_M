package d28Oop_Collections;

public class AudiRunner {
    public static void main(String[] args) {


//    Brake b = new Brake(); interface can not be inistiated..

        AudiA5 a = new AudiA5();
        a.abs(5);
        a.eco();
        a.turbo();
        a.gas();

        System.out.println("Engine.price = " + Engine.price); //interfaceName + variableName
        System.out.println("Engine.price = " + Brake.price);
         a.run();
        ((Engine)a).run();
    }
}
