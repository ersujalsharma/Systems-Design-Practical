package Decorator;

import Pizza.BasePizza;

public class ExtraCheese extends ToppingsDecorator{
    public ExtraCheese(BasePizza basePizza){
        super(basePizza);
    }
    @Override
    public int cost() {
        return super.basePizza.cost() + 10;
    }
}
