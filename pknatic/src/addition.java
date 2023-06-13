import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number a = ");
        int a = s.nextInt();
        System.out.print("Enter the Number b = ");
        int b = s.nextInt();
        int c = a+b;
        System.out.println("Sum of both numbers = " + c);
    }
}
