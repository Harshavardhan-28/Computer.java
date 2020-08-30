//Program to calculate the average of the digits in a number
import java.util.Scanner;
public class Digits4
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
        int count = 0;
        
        while (n!=0)
        {
            d = n%10;//storing the unit's place digit in d
            sum = sum + d;
            count++;
            n = n/10;//deleting the units place digit
        }
        
        int avg = sum/count;
        System.out.println ("The average of the digits is " +avg);
    }
    
    public static void main ()
    {
        Digits4 obj = new Digits4 ();
        obj.getNumber ();
        obj.Calculate ();
    }
}