class numcheck
{
 int a, b,c;
   void getDiv(int n)
 {
    int sum=0;
    for(int i=1; i<=n;i++)
    {
      if(n%i==0){
      sum= sum+ i;
    }
        b= sum;
        
    }
    a= n;
    
    }  
    void TestNumber()
    {
        int op=0;
      if(b<2*a)
      {
          op=-1;
          
        }
        else if(b==2*a)
        {
            op=0;
            
        }
        else if(b>2*a)
        {
            op=1;
        }
        else{
            op=404;
        }
        c=op;
        
        
    }
    void testNum()
    {
       if(c==0){
           System.out.println("Perfect Number");}
           else if(c==-1){
               System.out.println("Deficient number");}
               else if(c==1){
                   System.out.println("Abundant number");}
                   else{
                       System.out.println("Error");}
        
        
        
        
    }
    public static void main()
    {
     numcheck num=new numcheck();
     num.getDiv(67);
     num.TestNumber();
     num.testNum();
        
        
    }
}