class Employee//question 2
{
    String a;
    float b,c;
    void name(String a1)
    {
        a=a1;
        System.out.println("Name of the Employee: "+a);
    }
    void salary(float b1)
    {
     b=b1;   
     c=(50*b)/100+b;
     System.out.println("the salary of the employee "+c);
    }
    public static void main()
    {
        Employee obj=new Employee();
        obj.name("XYZ");
        obj.salary(5755);
    }
    
    
}