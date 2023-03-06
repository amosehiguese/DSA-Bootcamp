import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input currency in rupees ");
        long CurRupee = in.nextLong();

        long CurUsd = CurRupee / 75;

        System.out.println(CurRupee + "Rupees = " + CurUsd + "USD" );

    }
    }