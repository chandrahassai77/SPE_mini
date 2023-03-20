import java.util.Scanner;

public class SciCalculator {



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
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    public static double SquareRoot(double n) {

            return Math.sqrt(n);

    }
    public static double Natural_Log(double n) {

        return Math.log(n);

    }

    public static double Power(double base, double exponent) {

        return Math.pow(base, exponent);

    }




}




