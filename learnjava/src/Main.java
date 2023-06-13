import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int i=1,ot,pay,wh;
        Scanner input = new Scanner(System.in);
        while (i<10)
        {
            System.out.print("Enter the overtime of employee no. " + i + " = ");
            wh = input.nextInt();
            if(wh>40)
            {
                ot = wh -40;
                pay = ot * 120;
                System.out.println("Pay of Employee No. " + i + " Is " + pay);
            }
            else{
                System.out.println("No Extra Pay");
            }
            i++;

        }
    }
}