public class Bank {
    private int accountNo;
    private String name;
    private String email;
    private int number;
    private int balance;

    public Bank() {
        //  constructor within a constructor
        this("default name", "default email", 123,123456,500);
        System.out.println("In a constructor!");

    }

    public Bank(String name, String email, int accountNo, int number, int balance) {
        System.out.println("Inside a custom constructor with params!");
        this.balance = balance;
        this.number = number;
        this.email = email;
        this.name = name;
        this.accountNo = accountNo;
    }

    public Bank(String name, String email) {
        this(name, email , 1245,313316,515);
        this.name = name;
        this.email = email;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int cash) {
        this.balance += cash;
    }

    public void withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
