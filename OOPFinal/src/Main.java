public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!");
        Hamburger hamburger = new Hamburger("Basic", "Saucage", 50, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAdd1("Tomato", 5);
        hamburger.addHamburgerAdd2("Letuce", 5);
        System.out.println("Total price is " + hamburger.itemizeHamburger());
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHA1("Egg", 10);
        healthyBurger.itemizeHamburger();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addHamburgerAdd1("Letuce", 5);
    }

}
