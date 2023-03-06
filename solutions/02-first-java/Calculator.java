import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number ");
        double x = in.nextInt();

        System.out.print("Input second number ");
        double y = in.nextInt();

        System.out.println("Input operator: -, +, *, or /");
        char operator = in.next().charAt(0);

        double result = 0;

        if(operator == '-'){
            result = x - y;
        } else if (operator == '+') {
            result = x + y;
        } else if (operator == '*') {
            result = x * y;
        } else if (operator == '/') {
            result = x / y;
        } else{
            System.out.println("invalid operator");
        }
        System.out.println("Result " + result);

    }
}