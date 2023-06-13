import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the Term = ");
        int n = s.nextInt();
        int i,j,k,temp=n;
        for (i=1;i<=n;i++)
        {
            for (j=temp;j>0;j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
            for (k=1;k<=i;k++)
            {
                System.out.print("   ");
            }
            temp--;
        }
    }
}
