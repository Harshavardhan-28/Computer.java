class Q8
{
    void iteration(String str)
    {
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char c=str.charAt(i);
            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u')
            System.out.print(c);
            else
            {
              System.out.print(' ');  
            }
        } 
    }
    public static void main()
    {
        Q8 obj= new Q8();
        obj.iteration("hello gj");
    }
}
        