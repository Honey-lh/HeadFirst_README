package duck_test;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack!!!");
    }
}
