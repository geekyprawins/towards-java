public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String bread;

    private String add1Name;
    private double add1Price;

    private String add2Name;
    private double add2Price;

    private String add3Name;
    private double add3Price;

    private String add4Name;
    private double add4Price;

    public Hamburger(String name, String meat, double price, String bread) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bread = bread;
    }

    public void addHamburgerAdd1(String name, double price) {
        this.add1Name = name;
        this.add1Price = price;
    }

    public void addHamburgerAdd2(String name, double price) {
        this.add2Name = name;
        this.add2Price = price;
    }

    public void addHamburgerAdd3(String name, double price) {
        this.add3Name = name;
        this.add3Price = price;
    }

    public void addHamburgerAdd4(String name, double price) {
        this.add4Name = name;
        this.add4Price = price;
    }

    public double itemizeHamburger() {

        double hamPrice = this.price;
        System.out.println(this.name + " on a " + this.bread + " roll" + " price is " + this.price);
        if (this.add1Name != null) {
            hamPrice += add1Price;
            System.out.println("Added " + add1Name);
        }
        if (this.add2Name != null) {
            hamPrice += add2Price;
            System.out.println("Added " + add2Name);
        }
        if (this.add3Name != null) {
            hamPrice += add3Price;
            System.out.println("Added " + add3Name);
        }
        if (this.add4Name != null) {
            hamPrice += add4Price;
            System.out.println("Added " + add4Name);
        }
        return hamPrice;
    }
}
