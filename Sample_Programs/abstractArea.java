abstract class shape
{
    int d1;
    int d2;
    shape(int a,int b)
    {
        d1=a;
        d2=b;
    }
    
    abstract void area();
}

class triangle extends shape
{
    triangle(int a,int b)
    {
        super(a,b);
    }
    
    void area()
    {
        double area=0.5*d1*d2;
        System.out.println("\nArea of triangle:"+area);
    }
}

class rectangle extends shape
{
    rectangle(int a,int b)
    {
        super(a,b);
    }
    
    void area()
    {
        double area=d1*d2;
        System.out.println("\nArea of rectangle:"+area);
    }
}

class circle extends shape
{
    circle(int a,int b)
    {
        super(a,b);
    }
    
    void area()
    {
        double area=3.14*d1*d1;
        System.out.println("\nArea of circle:"+area);
    }
}

public class abstractArea
{
    public static void main(String args[])
    {
        triangle o1=new triangle(2,2);
        rectangle o2=new rectangle(2,2);
        circle o3=new circle(2,0);
        o1.area();
        o2.area();
        o3.area();
    }
}

