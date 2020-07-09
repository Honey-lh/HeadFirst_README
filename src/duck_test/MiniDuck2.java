package duck_test;

public class MiniDuck2 extends Duck {
    public MiniDuck2(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("i am two yazi");
    }
}
