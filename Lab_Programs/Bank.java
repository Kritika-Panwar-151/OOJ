import java.util.Scanner;
class Account 
{
    String cusName;
    String accNo;
    String accType;
    double balance;

    Account(String cN,String aN,String aT,double b)
    {
        cusName=cN;
        accNo=aN;
        accType=aT;
        balance=b;
    }

    void withdraw(double amount)
    {
        balance-=amount;
        System.out.println("\nFor "+cusName+":Amount withdrawn:"+amount+" Balance:"+balance);
    }

    void deposit(double amount)
    {
        balance+=amount;
        System.out.println("\nFor "+cusName+": Amount deposited:"+amount+" Balance:"+balance);
    }

    void display()
    {
        System.out.println("\nCustomer Name:"+cusName);
        System.out.println("Customer Balance:"+balance);
        System.out.println("Customer Account type:"+accType);
        System.out.println("Customer Accoun Number:"+accNo);
    }
    
}
class CurrentAccount extends Account
{
    static double minBalance=1000;
    static double serviceCharge=100;

    CurrentAccount(String cN,String aN,String aT,double b)
    {
        super(cN,aN,aT,b);
    }
    
    @Override
    void withdraw(double amount)
    {
        if(balance<minBalance)
        {
            super.balance-=serviceCharge;
            System.out.println("\nFor "+super.cusName+": Withdrawl denied,Balance less than minimum balance");
        }
        else
        {
            super.withdraw(amount);
        }
    }

    void checkBook()
    {
        System.out.println("\nCheck Book requested");
    }

    @Override
    void deposit(double amount)
    {
        if(amount>0)
        {
            super.deposit(amount);
        }
        else
        {
            System.out.println("\nFor "+cusName+": Amount deposited must be greater than 0");
        }
    }

    @Override
    void display()
    {
        super.display();
    }
}

class SavingsAccount extends Account
{
    int rate;
    double compoundingPeriod;

    SavingsAccount(String cN,String aN,String aT,double b,int r,int c)
    {
        super(cN,aN,aT,b);
        rate=r;
        compoundingPeriod=c;
    }

    void compoundInterest(int year)
    {
        double amount = super.balance * Math.pow((1 + rate /(100*compoundingPeriod)), compoundingPeriod * year);
        double interest = amount - super.balance;
        super.balance = amount;
        System.out.println("For "+cusName+": Compound Interest:"+interest+" Balance:"+super.balance);
    }
    
    @Override
    void withdraw(double amount)
    {
        if(super.balance<=0)
        {
            System.out.println("\nFor "+super.cusName+": Insufficient funds");
        }
        else
        {
            super.withdraw(amount);
        }
    }

    @Override
    void deposit(double amount)
    {
        if(amount>0)
        {
            super.deposit(amount);
        }
        else
        {
            System.out.println("\nFor "+cusName+": Amount deposited must be greater than 0");
        }
    }

    @Override
    void display()
    {
        super.display();
    }
}

public class Bank
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        CurrentAccount a1=new CurrentAccount("Tom","1AN1234","Current",500);
        SavingsAccount a2=new SavingsAccount("Tina","1AN2643","Savings",2000,20,2);

        System.out.println("\nAccount details:");
        a1.display();
        a2.display();

        
        a1.withdraw(2000);
        a2.withdraw(500);

        
        a1.deposit(5000);
        a2.deposit(0);

        System.out.println("\nAfter compounding interest:");
        a2.compoundInterest(4);
    

    }
}