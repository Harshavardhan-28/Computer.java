class method_overload
{
 void calc_int(int a, char ch)
 {
     if( ch == 'S')
     {
         System.out.println(a*a);
        }
        else
        {
            System.out.println(a*a*a);
        }
    }
    void calc_int(double a,double b, char ch)
    {
     if(ch == 'P')
     {
         System.out.println(a*b);
        }
        else
        {
            System.out.println(a+b);
        }
    }
    
}