package Decorator;

import Pizza.BasePizza;

public class Mushroom extends ToppingsDecorator{

    public Mushroom(BasePizza basePizza){
        super(basePizza);
    }
    @Override
    public int cost() {
        return super.basePizza.cost()+20;
    }
}
