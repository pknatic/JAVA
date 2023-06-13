import java.util.Scanner;
public class income_Tax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Income = ");
        int income = s.nextInt();
        int tax = 0;
        if (income < 250000)
        {
           tax = 0;
        }
        else if (income > 250000 && income < 500000)
        {
            tax = (5 * income)/100;
        }
        else if (income >= 500000 && income < 750000)
        {
            tax = (10 * income)/100;
        }
        else if (income >= 750000 && income < 1000000)
        {
            tax = (15 * income)/100;
        }
        else if (income >= 1000000 && income < 1250000)
        {
            tax = (20 * income)/100;
        }
        else if (income >= 1250000 && income < 1500000)
        {
            tax = (25 * income)/100;
        } else if (income > 1500000)
        {
            tax = (30 * income)/100;
        }
        System.out.println("Tax payable = " + tax);
    }
}
