import java.util.Scanner;
public class Weak_day {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number Between 1 to 31 = ");
        int day = s.nextInt();
        if(day>1 && day <31)
        {
            day = day%7;
            if(day==1)
                System.out.println("Monday");
            if(day==2)
                System.out.println("Tuesday");
            if(day==3)
                System.out.println("Wednesday");
            if(day==4)
                System.out.println("Thursday");
            if(day==5)
                System.out.println("Friday");
            if(day==6)
                System.out.println("Saturday");
            if(day==0)
                System.out.println("Sunday");
        }
        else
        {
            System.out.println("Please Enter a valid Number!");
        }

    }
}
