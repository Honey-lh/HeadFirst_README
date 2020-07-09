package duck_test;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i can not flying");
    }
}
