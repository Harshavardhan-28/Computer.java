 class Q1
{
    
    void loop(int a, int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
             System.out.print(a);
             a=a+1;
            }
            System.out.println();
        }   
    }
    
    public static void main()
    {
     Q1 objref;
     objref=new Q1();
     objref.loop(1,4);
    }
}