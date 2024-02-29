package Decorator;

import Pizza.BasePizza;

public class Jalepino extends ToppingsDecorator{
    public Jalepino(BasePizza basePizza){
        super(basePizza);
    }
    @Override
    public int cost() {
        return super.basePizza.cost() + 30;
    }
}
