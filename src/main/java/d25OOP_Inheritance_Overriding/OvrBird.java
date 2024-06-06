package d25OOP_Inheritance_Overriding;

import d24InstanceBlock_OOP.Mammal;

public class OvrBird extends Mammal {

//    public void eat(){
//        System.out.println("Birds eat");
//    }
//
//    public void drink(){
//        System.out.println("Birds drink");
//    }

    public void tweet(){ // this is not overridding method. Because tweet method is only in OvrBird class....

        System.out.println("Birds tweet");
    }

    @Override
    public void eat() {
        System.out.println("Birds eat");
    }

    @Override
    public void drink() {
        super.drink();

    }
}
