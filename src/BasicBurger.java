/**
 * Created by stephenboynton on 6/30/17.
 */
public class BasicBurger {

    private String bread;
    private String meat;
    private double basePrice = 3.00;
    private int addItems = 1;

    public BasicBurger () {
        this("plain", "burger", 3.00);
    }

    public BasicBurger(String bread, String meat, double basePrice) {
        if (bread.equals("rye") || bread.equals("plain") || bread.equals("seasame")) {
            this.bread = bread;
        } else {
            System.out.println("You can only chose 'rye', 'plain', or 'seasame'.");
        }
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void addCheese () {
        if (addItems <= 4) {
            System.out.println("You added cheese.");
            addItems += 1;
            basePrice += 1.10;
        } else {
            System.out.println("You can't add anymore items.");
        }
    }

    public void addPickle () {
        if (addItems <= 4) {
            System.out.println("You added pickles.");
            addItems += 1;
            basePrice += 0.5;
        } else {
            System.out.println("You can't add anymore items.");
    }
    }

    public void addBacon () {
        if (addItems <= 4) {
            System.out.println("You added baaaaacon!.");
            addItems += 1;
            basePrice += 0.5;
        } else {
            System.out.println("You can't add anymore items.");
        }
    }

    public void addMushrooms () {
        if (addItems <= 4) {
            System.out.println("You added mushrooms.");
            addItems += 1;
            basePrice += 0.5;
        } else {
            System.out.println("You can't add anymore items.");
        }
    }

    public double getBasePrice() {
        return basePrice;
    }
}
