import java.text.NumberFormat;

/**
 * Created by stephenboynton on 6/30/17.
 */
public class Main {

    public static void main(String[] args) {

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        BasicBurger order1 = new BasicBurger();

        order1.addBacon();
        order1.addCheese();
        order1.addMushrooms();
        order1.addPickle();
        order1.addMushrooms();

        System.out.println(formatter.format(order1.getBasePrice()));

        System.out.println("==========================");

        HealthyBurger order2 = new HealthyBurger();

        order2.addBacon();
        order2.addCheese();
        order2.addMushrooms();

        System.out.println(formatter.format(order2.getBasePrice()));

        System.out.println("===========================");

        DeluxeBurger order3 = new DeluxeBurger();

        order3.addBacon();
        System.out.println(formatter.format(order3.getBasePrice()));


    }

}
