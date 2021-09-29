public class Vip {
    private String name;
    private String email;
    private int creditLimit;

    public Vip() {
        this("default name", "default email", 1000);
    }

    public Vip(String name, String email) {
        this(name, email, 500);


    }

    public Vip(String name, String email, int creditLimit) {
        this.email = email;
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
