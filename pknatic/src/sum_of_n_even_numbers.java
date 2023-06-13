import java.util.Scanner;
public class sum_of_n_even_numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the term = ");
        int n = s.nextInt();
        int i , sum=0;
        System.out.println("Sum of n even numbers : ");
        for(i=1;i<=n*2;i++)
        {
            if (i%2==0)
            {
                sum=sum+i;
                System.out.print(i);
                if(i<n*2)
                {
                    System.out.print(" + ");
                }
            }
        }
        System.out.print(" = " + sum);
    }
}
