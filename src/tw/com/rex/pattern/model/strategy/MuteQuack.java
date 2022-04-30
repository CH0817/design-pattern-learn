package tw.com.rex.pattern.model.strategy;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}
