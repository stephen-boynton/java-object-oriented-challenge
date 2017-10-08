/**
 * Created by stephenboynton on 6/30/17.
 */
public class HealthyBurger extends BasicBurger {

    public HealthyBurger(String meat) {
        super("rye", meat, 2.50);
    }

    public HealthyBurger () {
        this("burger");
    }

    private int addItems = 1;

    @Override
    public void addCheese() {
        if (addItems <= 2) {
            super.addCheese();
            addItems += 1;
        } else {
            System.out.println("You can't add any additional items!");

        }
    }

    @Override
    public void addPickle() {
        if (addItems <= 2) {
            super.addPickle();
            addItems += 1;
        } else {
            System.out.println("You can't add any additional items!");

        }
    }

    @Override
    public void addBacon() {
        if (addItems <= 2) {
            super.addBacon();
            addItems += 1;
        } else {
            System.out.println("You can't add any additional items!");

        }
    }

    @Override
    public void addMushrooms() {
        if (addItems <= 2) {
            super.addMushrooms();
            addItems += 1;
        }else {
            System.out.println("You can't add any additional items!");

        }
    }
}
