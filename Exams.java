class Exams//class to input marks and calculate the percent
{
    int a= 420, b=450, c=480;
    double score, percent;
 Exams()//Constructor
 {
     double t1;
     double t2; double t3;
    }
    void calc() 
    {
        double t1= 0.3 * a;
        double t2= 0.3 * b;
        double t3= 0.4*c;
        score= t1+ t2+ t3;
        percent= (score/500)*100;
    }
    void print()
    {
        
}
}
