public class FootInchCm {

    public static void main(String[] args) {
        calcFeetAndInchesToCm(5, 10);
        calcFeetAndInchesToCm(-10, -5);
        calcFeetAndInchesToCm(70);
    }

    public static double calcFeetAndInchesToCm(double feet, double inches) {
        if (feet <= 0 || inches >= 12 || inches <= 0) {
            System.out.println("Invalid feet or inch");
            return -1;
        }
        double centimeters = (feet * 12 + inches) * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        return centimeters;


    }

    public static double calcFeetAndInchesToCm(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches equal to " + feet + " feet and " + remainingInches + " inches.");
            return calcFeetAndInchesToCm(feet, remainingInches);
        }

        return -1;
    }
}
