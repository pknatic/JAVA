import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = s.nextInt();
        int i;
        for( i = 1; i<=10;i++)
        {
            System.out.println(n + "x" + i + " = " + n*i );
        }
    }
}