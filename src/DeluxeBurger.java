/**
 * Created by stephenboynton on 6/30/17.
 */
public class DeluxeBurger extends BasicBurger {

    private double chips = 1;
    private double drink = 1;

    public DeluxeBurger(String bread, String meat, double chips, double drink) {
        super(bread, meat, 3.00 + chips + drink);
        this.chips = 1.50;
        this.drink = 1.00;
    }

    public DeluxeBurger() {
        this("seasame", "burger", 1.50, 1.00);
    }

    @Override
    public void addCheese() {
        System.out.println("You don't get no items, bro.");
    }

    @Override
    public void addPickle() {
        System.out.println("You don't get no items, bro.");
    }

    @Override
    public void addBacon() {
        System.out.println("You don't get no items, bro.");
    }

    @Override
    public void addMushrooms() {
        System.out.println("You don't get no items, bro.");
    }
}
