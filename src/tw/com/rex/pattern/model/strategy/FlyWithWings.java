package tw.com.rex.pattern.model.strategy;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm fly!");
    }

}
