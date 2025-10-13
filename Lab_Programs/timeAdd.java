import java.util.Scanner;
class Time
{
    int hours;
    int minutes;

    Time(int h,int m)
    {
        hours=h;
        minutes=m;
    }

    Time addTime(Time t1,Time t2)
    {
        int m=(t1.minutes+t2.minutes)%60;
        int h=(t1.hours+t2.hours)+(t1.minutes+t2.minutes)/60;
        return new Time(h,m);
    }

    void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Total Time: "+hours+":"+minutes);
    }
}

public class timeAdd
{
    public static void main(String args[])
    {
        Time t1=new Time(4,60);
        Time t2=new Time(5,20);
        Time t3=t1.addTime(t1,t2);
        t3.display();                                                                                                                                                                  
    }   
}