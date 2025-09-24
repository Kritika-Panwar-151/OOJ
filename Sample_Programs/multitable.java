import java.util.Scanner;
public class multitable
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("\nEnter the number:");
        int num=sc.nextInt();
        System.out.println("The multiplication table for"+num+"is:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}