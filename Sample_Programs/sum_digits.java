

import java.util.Scanner;

public class sum_digits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the number:");
        int n=sc.nextInt();//To get value of n as an in
        int og_num=n;
        int digit,num=0;
        while(n!=0)
        {
            digit=n%10;
            num=num+digit;
            n=n/10;
        }
        System.out.print("Sum of digits of number "+og_num+"is: "+num);
    }
}