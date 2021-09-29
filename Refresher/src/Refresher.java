public class Refresher {

    public static void main(String[] args) {
        System.out.println("I am back mofos!!!!!");

        Car porshe = new Car();
        Car holden = new Car();
        porshe.setModel("Carrera");
        holden.setModel("Holden");
        System.out.println("Model is " + porshe.getModel());
        System.out.println("Model is " + holden.getModel());

        Bank myAcc = new Bank();
        Bank newAcc = new Bank("Bob", "bob@gmail.com", 12345, 789456, 500);
        Bank bobAcc = new Bank("BOBBY", "bobby@enjoy.com");
        System.out.println(bobAcc.getName());
        myAcc.setBalance(100);
        System.out.println("Current balance is " + myAcc.getBalance());
        myAcc.deposit(50);
        System.out.println("Current balance is " + myAcc.getBalance());

        myAcc.withdraw(150);
        System.out.println("Current balance is " + myAcc.getBalance());

        myAcc.withdraw(20);
        System.out.println("Current balance is " + myAcc.getBalance());

        Vip v1 = new Vip();
        System.out.println(v1.getName());
        Vip v2 = new Vip("James", "james@j.com");
        System.out.println(v2.getName() + ' '+ v2.getCreditLimit());
        Vip v3 = new Vip("Jack", "jack@jack.com", 10000);
        System.out.println(v3.getCreditLimit());

    }
}
