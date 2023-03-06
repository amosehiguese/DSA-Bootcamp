import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number ");
        long x = in.nextInt();

        System.out.print("Input second number ");
        long y = in.nextInt();

        if (x > y){
            System.out.println(x);
        }else {
            System.out.println(y);
        }

    }
}
