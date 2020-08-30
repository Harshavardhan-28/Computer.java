import java.util.Scanner;
public class Interest2
{
    double p, r, t, CI, A; 
    int acc_type;
    char senior_citizen;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the Principal Amount: ");
        p = sc.nextDouble ();
        System.out.println ("Enter the number of yesrs: ");
        t = sc.nextDouble ();
        System.out.println ("Enter 1 if you are applying for a fixed deposit or enter 2 for a recurring deposit");
        acc_type = sc.nextInt ();
        System.out.println ("Enter 'Y' or 'y' if you are a senior citizen or else enter 'N' or 'n' ");
        senior_citizen = sc.next().charAt(0);
    }
    
    void DetermineAccountType ()
    {
        switch (acc_type)
        {
            case 1: 
                     if (t<=1.0)
                         r = 7.5;
                     else if (t>1 && t<=5)
                         r = 10.0;
                     else 
                         r = 9.5;
                     break;
            case 2:
                     if (t<=2)
                         r = 6.0;
                     else if (t>2 && t<=7)
                         r = 7.5;
                     else 
                         r = 8.0;
                     break;
            default: 
                     System.out.println ("Invalid Character");
                     break;
        }
    }
    
    void DetermineAge ()
    {
        switch (senior_citizen)
        {
            case 'n':
            case 'N':
                      r = r+0;
                      break;
            case 'y':
            case 'Y':
                      r = r+1;
                      break;
            default: 
                     System.out.println ("Invalid Character");
                     break;
        }
    }
    
    void Calculate_Interest ()
    {
        CI = p * Math.pow((1 + r/100),t);
        A = p + CI;
        System.out.println ("The Amount is " +A);
        System.out.println ("The Coumpound Interest is " +CI);
    }
    
    public static void main ()
    {
        Interest2 obj = new Interest2 ();
        obj.getData ();
        obj.DetermineAccountType ();
        obj.DetermineAge ();
        obj.Calculate_Interest ();
    }
}