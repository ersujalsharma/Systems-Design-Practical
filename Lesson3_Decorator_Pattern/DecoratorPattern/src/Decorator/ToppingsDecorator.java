package Decorator;

import Pizza.BasePizza;

public abstract class ToppingsDecorator extends BasePizza{
    public BasePizza basePizza;
    public ToppingsDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    public abstract int cost();
}
