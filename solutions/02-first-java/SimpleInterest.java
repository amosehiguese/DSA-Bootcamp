import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("principal ");
        float principal = in.nextFloat();
        System.out.print("time ");
        float time = in.nextFloat();
        System.out.print("rate ");
        float rate = in.nextFloat();

        float interest = principal * time * rate;
        System.out.println("Interest is " + interest);
    }
}