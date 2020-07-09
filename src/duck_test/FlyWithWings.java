package duck_test;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i can flying");
    }
}
