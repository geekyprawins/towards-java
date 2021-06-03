public class ForLoops {

    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("The interest for $10,000 at ROI of " + i + "% = " + CalcInterest(10000, i));
        }
        int count = 0;
        for (int p = 5; p < 20; p++) {

            if (isPrime(p)) {
                System.out.println(p + " is a prime number.");
                count++;

                if (count == 3) {
                    System.out.println("Exitting the for loop");
                    break;
                }

            }


        }
        int sum = 0;
        int diviCount = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                diviCount++;
                System.out.println(i + " is divisible by both 3 and 5 ");
                if (diviCount == 5)
                    break;
            }


        }
        System.out.println(sum + " is the sum of first 5 numbers divisible by 3 & 5");
        int whileCount = 1;
        while (whileCount < 6) {
            System.out.println("The count is " + whileCount);
            whileCount++;
        }
        int doWhileCount = 0;
        do {
            System.out.println("Count is now " + doWhileCount);
            doWhileCount++;
        } while (doWhileCount < 10);

        int number = 4;
        int finishNum = 20;
        while (number<=finishNum){
            number ++ ;
             if (! isEvenNumber(number))
                 continue;
            System.out.println(number + " is an even number.");
        }

    }

    private static double CalcInterest(double amount, double rateOfInterest) {
        return (amount * (rateOfInterest / 100));
    }

    public static boolean isPrime(int n) {

        if (n == 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;

        }
        return true;
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0)
            return true;
        return false;

    }
}
