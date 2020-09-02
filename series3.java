import java.util.Scanner;
class series3
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void compute()
    {
        int s=1;
        int sum=1;
        for(int i=2;i<=n;i++)
        {
            s=s+i;
            sum=sum+s;
        }
        System.out.println("the sum of series="+sum);
    }
    public static void main()
    {
        series3 ob=new series3();
        ob.input();
        ob.compute();
    }
}