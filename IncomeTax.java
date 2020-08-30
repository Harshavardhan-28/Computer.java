import java.util.Scanner;
public class IncomeTax
{
    double income, tax;
    
    void accept ()
    {
        Scanner sc = new Scanner (System.in);
        String n = null;
        System.out.println ("Enter the name of the employee: ");
        n = sc.nextLine ();       
        System.out.println ("Enter the income of the Employee: ");
        double i = 0.0;
        i = sc.nextDouble ();
        income = i;
    }
    
    void calculate ()
    {
        if (income<=40000)
            tax = 0.0;
        else if ((income>40000) && (income<=70000))
            tax = income* 20/100;
        else if ((income>70000) && (income<=100000))
            tax = income * 30/100;
        else
            tax = income * 40/100;
            
        System.out.println ("The tax to be paid by the employee is " +tax);
    }
    
    public static void main ()
    {
        IncomeTax obj = new IncomeTax ();
        obj.accept ();
        obj.calculate ();
    }
}