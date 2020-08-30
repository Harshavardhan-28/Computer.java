class series
{
 int n, x, s;
 void calc(int p, int z)
 {
     n=p;
     x=z;
     int sum=0;
   for(int i=0;i<=n;i++)
   {
       
     sum= sum + Math.pow(x, i);
     
    }
    
    s=sum;
    
}
void print()
{
    System.out.print(s);
    
    
}


}
