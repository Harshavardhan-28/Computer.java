import java.util.Scanner;

class Number
{
 int num;
 
 void readNumber()
 {
     Scanner sc= new Scanner(System.in);
     System.out.println(" Enter the number");
     num= sc.nextInt();
     
    }
    void digitSum()
    {
        int n= num;
        int digit=-1;
        int sum=0;
        while(n!=0)
        {
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("the sum of the digits in the number is:"+ sum);
    }
    public static void main()
    {
     Number obj= new Number();
     obj.readNumber();
     obj.digitSum();
        
    }
}