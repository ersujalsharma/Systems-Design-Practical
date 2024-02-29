import Decorator.*;
import Pizza.BasePizza;
import Pizza.Margherita;
import Pizza.VegDelight;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        BasePizza basePizza = new Margherita();
        ToppingsDecorator toppingsDecorator = new ExtraCheese(basePizza);
        ToppingsDecorator toppingsDecorator1 = new Mushroom(toppingsDecorator);
        ToppingsDecorator toppingsDecorator2 = new Jalepino(toppingsDecorator1);

        System.out.println(basePizza.cost());
        System.out.println(toppingsDecorator.cost());
        System.out.println(toppingsDecorator1.cost());
        System.out.println(toppingsDecorator2.cost());
        System.out.println();
        BasePizza basePizza1 = new VegDelight();
        ToppingsDecorator toppingsDecorator3 = new ExtraCheese(basePizza1);
        ToppingsDecorator toppingsDecorator4 = new Mushroom(toppingsDecorator3);
        ToppingsDecorator toppingsDecorator5 = new Jalepino(toppingsDecorator4);

        System.out.println(basePizza1.cost());
        System.out.println(toppingsDecorator3.cost());
        System.out.println(toppingsDecorator4.cost());
        System.out.println(toppingsDecorator5.cost());
        System.out.println();
        BasePizza basePizza2 = new Margherita();
        ToppingsDecorator toppingsDecorator6 = new Layering(toppingsDecorator5,basePizza2);
        System.out.println(basePizza2.cost());
        System.out.println(toppingsDecorator6.cost());
    }
}