import java.util.Scanner;
interface discount
{
    double apply(double price);
}
class twenty implements discount
{
    
    @Override
    public double apply(double price)
    {
        double p=0.8*price;
        System.out.println("Discounted Price(20%):"+p);
        return p;
    }
}

class ten implements discount
{
    @Override
    public double apply(double price)
    {
        double p=0.9*price;
        System.out.println("Discounted Price(10%):"+p);
        return p;
    }
}

class fifty implements discount
{
    @Override
    public double apply(double price)
    {
        double p=0.5*price;
        System.out.println("Discounted Price(50%):"+p);
        return p;
    }
}

public class eapp
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product price:");
        double p=sc.nextDouble();
        discount d[]={new twenty(),new ten(),new fifty()};
        for(discount i:d)
        {
            i.apply(p);
        }

    }
}