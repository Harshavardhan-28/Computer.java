class income
{
 double time,rate,salary; 
 String d,iv;
 void calc(double t, double r)
 {
     double s=0;
     salary= s;
     String error="", i="";
     
     time=t;
     rate =r;
     if (time<= 35)
     salary= 35*rate;
     else if (time<=60)
     salary= (35*rate)+(25*rate*1.5);
     else if(time <=70)
     salary=(35*rate)+(25*rate*1.5)+(10*rate*2);
     else if(time>70)
     error="You are not allowed to work for more than 70 hours a week.";
     else
     {
     i="Invalid input";
    }
     d= error;
     iv=i;
    }
    void print()
    {
      if (time<= 35)
     System.out.println("Your salary is:"+salary);
     else if (time<=60)
     System.out.println("Your salary is:"+salary);
     else if(time <=70)
     System.out.println("Your salary is:"+salary);
     else if(time>70)
     System.out.println(d);
     else
     {
     System.out.println(iv);
    }  
    }
    public static void main()
    {
     income salary= new income();
     salary.calc(60, 900);
     salary.print();
    }
}