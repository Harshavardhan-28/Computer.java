import java.util.Scanner;
public class GreaterNumber
{
    int n1,n2,n3, max;
    void accept ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the first number: ");
        int num1 = sc.nextInt ();
        n1 = num1;
        System.out.println ("Enter the second number: ");
        int num2 = sc.nextInt ();
        n2 = num2;
        System.out.println ("Enter the third number: ");
        int num3 = sc.nextInt ();
        n3 = num3;
    }
    
    void calculate ()
    {
        if ((n1>0) && (n2>0) && (n3>0))
        {
            max = n1;
            if (n2>n1)
            {
                max = n2;
                if (n3>n2)
                {
                    max = n3;
                }
            }
        }
        else 
        {
            System.out.println ("The numbers are invalid");
        }
        System.out.println ("The greatest number out of the three numbers is " +max);
    }
    public static void main ()
    {
        GreaterNumber obj = new GreaterNumber ();
        obj.accept ();
        obj.calculate ();
    }
}