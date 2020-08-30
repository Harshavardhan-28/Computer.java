//Program to calculate the product of digits in a number
import java.util.Scanner;
public class Digits3
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
        int prod = 1;
        while (n!=0)
        {
            d = n%10;
            n = n/10;
            prod = prod * d;
        }
        System.out.println ("The product of the digits is " +prod);
    }
    
    public static void main ()
    {
        Digits3 obj = new Digits3 ();
        obj.getNumber ();
        obj.Calculate ();
    }
}