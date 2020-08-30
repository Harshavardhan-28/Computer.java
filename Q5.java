



 

    class Q5
{
   void printNums(char ch) 
    { 
        int n=5;
        switch (ch)
        {
            case'1':
        for(int i=0; i<=n; i++) 
        { 
            int num=1;
            for(int j=0; j<=i; j++) 
            {   
                System.out.print(num+ " ");  
                num++; 
            } 
  
           
            System.out.println(); 
        } 
        break;
        case'2':
             for (int k = 5; k >= 0; k--)
{
   int alphabet = 65;
   for (int l = 0; l <= k; l++)
   {
       System.out.print((char) (alphabet + l) + " ");
   }
   System.out.println();
}
break;
    }    
}
    public static void main()
    {
        Q5 obj=new Q5();
        obj.printNums('1');
    }
    } 