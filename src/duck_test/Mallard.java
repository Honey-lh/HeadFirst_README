package duck_test;

public class Mallard extends Duck {

    public Mallard(){
        quackBehavior =new Quack();
        flyBehavior =new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("i real duck");
    }

}
