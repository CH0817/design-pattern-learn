package tw.com.rex.pattern;

import tw.com.rex.pattern.model.strategy.Duck;
import tw.com.rex.pattern.model.strategy.FlyNoWay;
import tw.com.rex.pattern.model.strategy.MallardDuck;
import tw.com.rex.pattern.model.strategy.MuteQuack;

public class Strategy {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        // 預設行為
        mallard.display();
        mallard.swim();
        mallard.performFly();
        mallard.performQuack();
        // 動態指定行為
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performFly();
        mallard.performQuack();
    }

}
