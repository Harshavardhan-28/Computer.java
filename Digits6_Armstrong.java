//Program to check if a number is an armstrong number or not
import java.util.Scanner;
public class Armstrong2
{
    int num, counting;
    void getNumber ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number: ");
        num = sc.nextInt ();
        
    }
    void getDigit()
    {
      int n= num;
      int count = 0;
      while(n!=0){
         n= n/10;
         count++;
          
          
          
          
        }
        counting= count;
        
        
        
    }
    void calculate ()
    {
        double sum = 0;
        int n = num;
        while (n!=0)
        {
            int d = n%10;
            n = n/10;
            sum = sum + (Math.pow(d, counting));
        }
        
        if (sum == num)
            System.out.println ("The number entered is an armstrong number");
        else
            System.out.println ("The number entered is not an armstrong number");
    }
    
    public static void m ()
    {
        Armstrong2 obj = new Armstrong2 ();
        obj.getNumber();
        obj.getDigit();
        obj.calculate ();
    }
}
