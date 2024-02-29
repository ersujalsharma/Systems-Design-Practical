package Decorator;

import Pizza.BasePizza;

public class Layering extends ToppingsDecorator{
    BasePizza currentPizza;
    public Layering(BasePizza basePizza,BasePizza current){
        super(basePizza);
        this.currentPizza = current;
    }
    @Override
    public int cost() {
        return basePizza.cost()+currentPizza.cost();
    }
}
