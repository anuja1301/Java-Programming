import java.util.Scanner;

public class Math 
 {
    public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);

        try 
       {
            System.out.println("Enter first number: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter operation (+, -, *, /): ");
            char operation = scanner.nextLine().charAt(0);

            int result;
            switch (operation) 
           {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 == 0)
                    {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation. Please enter +, -, *, or /.");
            }
        } 
            catch (NumberFormatException e) 
        {
            System.out.println("Invalid input. Please enter valid numbers.");
        } 
            catch (ArithmeticException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
            catch (IllegalArgumentException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
            finally 
        {
            scanner.close();
        }
    }
}
