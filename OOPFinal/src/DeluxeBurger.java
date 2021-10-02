public class DeluxeBurger extends Hamburger {
    @Override
    public void addHamburgerAdd1(String name, double price) {
        System.out.println("Cannot add here!");
    }

    @Override
    public void addHamburgerAdd2(String name, double price) {
        System.out.println("Cannot add here!");
    }

    @Override
    public void addHamburgerAdd3(String name, double price) {
        System.out.println("Cannot add here!");

    }

    @Override
    public void addHamburgerAdd4(String name, double price) {
        System.out.println("Cannot add here!");
    }

    public DeluxeBurger() {
        super("Deluxe", "Saucage and Bacon", 50, "White");
        super.addHamburgerAdd1("Tomato", 5);

    }
}
