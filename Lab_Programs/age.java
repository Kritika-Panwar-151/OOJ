class WrongAge extends RuntimeException
{
    public WrongAge(String s)
    {
        super(s);
    }
}

class father
{
    int f_age;
    father(int f_age)
    {
        this.f_age=f_age;
        if(this.f_age<0)
        {
            throw new WrongAge("Father's age cant be less than 0");
        }
    }
}

class son extends father
{
    int s_age;
    son(int f_age,int s_age)
    {
        super(f_age);
        this.s_age=s_age;
        if(s_age>=f_age)
        {
            throw new WrongAge("Father's age cant be less than sons age");
        }
    }
}

public class age
{
    public static void main(String[] args) 
    {
        try
        {
            son s1=new son(32,40);
            
        }
        catch(WrongAge e)
        {
            System.out.println(e.getMessage());
        }
        
        

    }
}