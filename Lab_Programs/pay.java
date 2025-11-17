interface payment
{
    boolean process(double amount);
}

class creditCard implements payment
{
    double balance;
    creditCard(double a) 
    {
        balance=a;
    }

    @Override
    public boolean process(double amount)
    {
        System.out.println("Credit Card Transaction:");
        if(amount>50000)
        {
            return false;
        }
        else if(balance<amount)
        {
            System.out.println("Not enough balance");
            return false;
        }
        else
        {
            balance-=amount;
        }
        return true; 
    }
      
}

class upi implements payment
{
    double balance;
    upi(double a) 
    {
        balance=a;
    }

    @Override
    public boolean process(double amount)
    {
        System.out.println("UPI Transaction:");
        if(amount>100000)
        {
            return false;
        }
        else if(balance<amount)
        {
            System.out.println("Not enough balance");
            return false;
        }
        else
        {
            balance-=amount;
        }
        return true; 
    }
      
}

public class pay
{
    public static void main(String[] args)
    {
        payment p[]={new creditCard(60000),new upi(25000)};
        for(payment i:p)
        {
            if(i.process(56000)==true)
            {
                System.out.println("Processing");
            }
            else 
            {
                System.out.println("Not Processing");
            }
        }
       
    }
}