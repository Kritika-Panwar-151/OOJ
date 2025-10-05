import java.util.Scanner;
class shape
{
    double c_radius;
    double r_length;
    double r_breadth;
    double t_side1;
    double t_side2;
    double t_height;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the radius of the circle:");
        c_radius=sc.nextDouble();
        System.out.println("Enter the length and breadth of the rectangle:");
        r_length=sc.nextDouble();
        r_breadth=sc.nextDouble();
        System.out.println("Enter the length of parallel sides and height of the trapezium:");
        t_side1=sc.nextDouble();
        t_side2=sc.nextDouble();
        t_height=sc.nextDouble();
    }

    double circle()
    {
        double area_c=3.18*c_radius*c_radius;
        return area_c;
    }
    double rectangle()
    {
        double area_r=r_length*r_breadth;
        return area_r;
    }
    double trapezium()
    {
        double area_t=0.5*(t_side1+t_side2)*t_height;
        return area_t;
    }

    void display(double a,double r,double t)
    {
        System.out.println("Area of circle:"+a);
        System.out.println("Area of rectangle:"+r);
        System.out.println("Area of trapezium:"+t);
    }
}


public class shapearea 
{
    public static void main(String args[])
    {
        shape obj1=new shape();
        obj1.accept();
        obj1.display(obj1.circle(),obj1.rectangle(),obj1.trapezium());
    }
}
