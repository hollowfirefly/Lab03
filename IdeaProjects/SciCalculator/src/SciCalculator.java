import java.util.Scanner;
public class SciCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double currentResult = 0.0;
        int userInput = 0;
        double numberOne = 0.0;
        double numberTwo = 0.0;
        double sumNumbers = 0.0;
        int totalCalc = 0;
        double avgCalc = 0.0;
        boolean calcSys = true;
        boolean errorInput = true;

        while (calcSys)
        {
            errorInput = true;
            System.out.println("");
            System.out.println("Current Result: " + currentResult);

            System.out.println("");
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
            System.out.println("");
            System.out.print("Enter Menu Selection: ");
            userInput = scnr.nextInt();


            while (errorInput) {
                if (userInput == 1)
                    {
                System.out.print("Enter first operand: ");
                numberOne = scnr.nextDouble();
                System.out.print("Enter second operand: ");
                numberTwo = scnr.nextDouble();
                currentResult = numberOne + numberTwo;
                errorInput = false;
                totalCalc = totalCalc + 1;
                sumNumbers += currentResult;

            } else if (userInput == 2)
            {
                System.out.print("Enter first operand: ");
                numberOne = scnr.nextDouble();
                System.out.print("Enter second operand: ");
                numberTwo = scnr.nextDouble();
                currentResult = numberOne - numberTwo;
                errorInput = false;
                totalCalc = totalCalc + 1;
                sumNumbers += currentResult;
            }
            else if (userInput == 3)
            {
                System.out.print("Enter first operand: ");
                numberOne = scnr.nextDouble();
                System.out.print("Enter second operand: ");
                numberTwo = scnr.nextDouble();
                currentResult = numberOne * numberTwo;
                errorInput = false;
                totalCalc = totalCalc + 1;
                sumNumbers += currentResult;
            }
            else if (userInput == 4)
            {
                System.out.print("Enter first operand: ");
                numberOne = scnr.nextDouble();
                System.out.print("Enter second operand: ");
                numberTwo = scnr.nextDouble();
                currentResult = numberOne / numberTwo;
                errorInput = false;
                totalCalc = totalCalc + 1;
                sumNumbers += currentResult;
            }
            else if (userInput == 5)
            {
                System.out.print("Enter first operand: ");
                numberOne = scnr.nextDouble();
                System.out.print("Enter second operand: ");
                numberTwo = scnr.nextDouble();
                currentResult = Math.pow(numberOne, numberTwo);
                errorInput = false;
                totalCalc = totalCalc + 1;
                sumNumbers += currentResult;
            }
            else if (userInput == 6)
            {
                System.out.print("Enter first operand: ");
                numberOne = scnr.nextDouble();
                System.out.print("Enter second operand: ");
                numberTwo = scnr.nextDouble();
                currentResult = Math.log10(numberTwo) / Math.log10(numberOne);
                errorInput = false;
                totalCalc = totalCalc + 1;
                sumNumbers += currentResult;
            }
            else if (userInput == 7)
            {
                if (totalCalc == 0) {
                    System.out.println("Error: No calculations yet to average!");
                    System.out.print("Enter Menu Selection: ");
                    userInput = scnr.nextInt();
                    errorInput = true;
                }
                else
                {
                    avgCalc = sumNumbers / totalCalc;
                    System.out.println("Sum of calculations: " + sumNumbers);
                    System.out.println("Number of calculations: " + totalCalc);
                    System.out.println("Average of calculations: " + (double)Math.round(avgCalc * 100) / 100);
                    System.out.print("Enter Menu Selection: ");
                    userInput = scnr.nextInt();
                    errorInput = true;
                }
            }
            else if (userInput == 0) //Quits program
            {
                System.out.println("Thanks for using this calculator. Goodbye!");
                calcSys = false;
                errorInput = false;
            }
            else
            {
                    System.out.println("Error: Invalid selection!");
                    System.out.print("Enter Menu Selection: ");
                    userInput = scnr.nextInt();

                }
            }
        }
    }
}
