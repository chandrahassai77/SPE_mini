import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SciCalculator {


    private static final Logger logger = LogManager.getLogger(SciCalculator.class);


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            //System.out.println("\nWelcome!\n");

            System.out.println("\nCalculator Menu");
            System.out.println("1. Square root function");
            System.out.println("2. Factorial function");
            System.out.println("3. Natural logarithm (base e)");
            System.out.println("4. Power function");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Thank you!");
                break;
            } else if (choice == 1) {
                System.out.print("Enter a number: ");
                double num = input.nextDouble();
                double result = SquareRoot(num);
                System.out.printf("Result: %.2f\n", result);
            } else if (choice == 2) {
                System.out.print("Enter a number: ");
                int num = input.nextInt();
                int result = factorial(num);
                System.out.printf("Result: %d\n", result);
            } else if (choice == 3) {
                System.out.print("Enter a number: ");
                double num = input.nextDouble();
                double result = Natural_Log(num);
                System.out.printf("Result: %.2f\n", result);
            } else if (choice == 4) {
                System.out.print("Enter the base: ");
                double base = input.nextDouble();
                System.out.print("Enter the exponent: ");
                double exponent = input.nextDouble();
                double result = Power(base, exponent);
                System.out.printf("Result: %.2f\n", result);
            } else {
                System.out.println("Invalid input, please try again.");
            }
        }
    }

    public static int factorial(int n) {

        if(n<0)
        {
            logger.error("[FACTORIAL] - " + n + " is not defined.");
            logger.error("[RESULT - FACTORIAL] - " + "-1");

            return -1;
        }

        int res = 1;
        for(int i=1; i<=n; i++)
        {
            res = res * i;
        }
        logger.error("[FACTORIAL] - " + n);
        logger.error("[RESULT - FACTORIAL] - " + res);
        return res;

    }
    public static double SquareRoot(double n) {

        if(n<0)
        {
            logger.error("[SQRT] - " + n + " is not defined");
            logger.error("[RESULT - SQRT] - " + "-1");

            return -1;
        }

        double tmp = Math.sqrt(n);
        logger.info("[SQRT] - " + n);
        logger.info("[RESULT - SQRT] - " + tmp);
        return tmp;

    }
    public static double Natural_Log(double n) {

        if(n<=0)
        {
            logger.error("[LOG] - "+ n+" is not defined");
            logger.error("[RESULT - LOG] - "+"-1");
            return -1;
        }

        double temp = Math.log(n);

        logger.info("[LOG] - " + n);
        logger.info("[RESULT - LOG] - " + temp);

        return temp;

    }

    public static double Power(double base, double exponent) {

        if(base == 0 && exponent == 0)
        {
            logger.error("[POWER] - " + base + ", " + exponent + "is not defined");
            logger.error("[RESULT - POWER] - " + "-1");

            return -1;
        }

        double temp = Math.pow(base, exponent);
        logger.info("[POWER] - " + base + ", " + exponent);
        logger.info("[RESULT - POWER] - " + temp);

        return temp;

    }




}




