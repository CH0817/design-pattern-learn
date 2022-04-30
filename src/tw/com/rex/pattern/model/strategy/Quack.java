package tw.com.rex.pattern.model.strategy;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
