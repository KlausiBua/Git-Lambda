package beispiel4.htlgkr.KlausnerL22066;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbstractCalculator calculator = null;

        while (true) {
            System.out.println("Choose calculator:");
            System.out.println("1 = Rational calculator");
            System.out.println("2 = Vector calculator");
            System.out.println("3 = Complex calculator");
            System.out.println("4 = Exit program");
            int choice = scanner.nextInt();

            if (choice == 4) {
                break;
            }

            switch (choice) {
                case 1:
                    calculator = new RationalCalculator();
                    break;
                case 2:
                    calculator = new VectorCalculator();
                    break;
                case 3:
                    calculator = new ComplexCalculator();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            Number x = inputNumber(scanner, "x");
            Number y = inputNumber(scanner, "y");

            while (true) {
                System.out.println("Choose operation:");
                System.out.println("1 = add");
                System.out.println("2 = subtract");
                System.out.println("3 = multiply");
                System.out.println("4 = divide");
                System.out.println("5 = enter numbers again");
                int operation = scanner.nextInt();

                if (operation == 5) {
                    x = inputNumber(scanner, "x");
                    y = inputNumber(scanner, "y");
                    continue;
                }

                Number result = null;
                switch (operation) {
                    case 1:
                        result = calculator.add(x, y);
                        break;
                    case 2:
                        result = calculator.subtract(x, y);
                        break;
                    case 3:
                        result = calculator.multiply(x, y);
                        break;
                    case 4:
                        result = calculator.divide(x, y);
                        break;
                    default:
                        System.out.println("Invalid operation.");
                        continue;
                }

                System.out.println("=========================");
                System.out.println("Solution:");
                System.out.println(result);
                System.out.println("=========================");
            }
        }

        scanner.close();
    }

    private static Number inputNumber(Scanner scanner, String name) {
        System.out.println("Enter number " + name + " a:");
        double a = scanner.nextDouble();
        System.out.println("Enter number " + name + " b:");
        double b = scanner.nextDouble();
        return new Number(a, b);
    }
}
