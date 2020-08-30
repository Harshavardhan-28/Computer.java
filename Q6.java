public class Q6
{
     public static void main(String str)
    {
        int n = str.length();
        int start= 0,end = 0,maxlen=0,maxstr=0,maxend=0;
        for (int i = 0; i < n; i++)
        {
            if (str.charAt(i) != ' ')
              end=i;
            else
            {
                int temp=end-start;
                if(temp > maxlen)
                {
                maxlen = temp;
                maxstr= start;
                maxend= end -1;
            }
            start= i+1;
            }
        }
        
        for(int j= maxstr; j>= maxend;j++)
        {
         System.out.print(str.charAt(j));   
        }
        
        
    }
    
}
