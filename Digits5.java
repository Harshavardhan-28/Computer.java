//Program to calculate the sum of squares of the digits in a number
import java.util.Scanner;
public class Digits5
{
    int num;
    void getNumber ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number: ");
        num = sc.nextInt ();
    }
    
    void Calculate ()
    {
        int d;
        int n = num;
        int sum = 0;
        while (n!=0)
        {
            d = n%10;
            n = n/10;
            sum = sum + (d*d);
        }
        System.out.println ("The sum of the squares of the digits is " +sum);
    }
    
    public static void main ()
    {
        Digits5 obj = new Digits5 ();
        obj.getNumber ();
        obj.Calculate ();
    }
}