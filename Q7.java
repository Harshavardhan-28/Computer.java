class Q7
{
   String name;
 int rno, marks;
 void Name(String N1)
 {
     name=N1;
     System.out.println("Name of the student: "+ name);
     System.out.println();
    }
 void RollNo(int R1)
 {
     rno=R1;
     System.out.println("Roll Number of the Student: "+rno);
     System.out.println();
    }
 void Marks(int M1)
 {
     marks=M1;
     System.out.println("Marks acquired by the student: "+ marks);
     System.out.println();
     System.out.println("You have assigned the following stream: ");
     
     if(marks>=90)
     {
         System.out.println("Science with Computers");
        }
        else if((marks>=80)&&(marks<90))
        {
         System.out.println("Science without Computers");   
        }
        else if((marks>=70)&&(marks<80))
        {
            System.out.println("Commerce with Maths");
        }
        else if((marks>=60)&&(marks<70))
        {
            System.out.println("Commerce without Maths");
        }
        else
        {
            System.out.println("No other option left");
        }
    }
    public static void main()
    {
    Q7 obj=new Q7();
    obj.Name("Donald Trump");
    obj.RollNo(25);
    obj.Marks(57);
    
        
    }
}