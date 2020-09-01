//Program to check if an ISBN number is legal or illegal
import java.util.Scanner;
public class ISBN 
{
    long isbn;
    void getISBN ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the ISBN number");
        isbn = sc.nextLong ();
    }
    
    void checkISBN ()
    {
        long n = isbn;
        long sum = 0;
        
            for (int i = 0; i<=9; i++)
            {
                for(int j=1; j<=10;j++){
                long a= n%10;
                long b= a*j;
                sum = sum + b;
                n=n/10;
            }
        }
            if (sum%11 == 0)
               System.out.println ("Legal ISBN");
            else
                System.out.println ("Illegal ISBN");
            }
            
    
    
    public static void main ()
    {
        ISBN obj = new ISBN ();
        obj.getISBN();
        obj.checkISBN();
        
    }
}
