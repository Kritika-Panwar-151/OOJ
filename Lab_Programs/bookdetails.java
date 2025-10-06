 import java.util.Scanner;
 class book
 {
    String name;
    String author;
    double price;
    int num_pages;

    //Constructor name should be same as classname
    public book(String name,String author,double price,int num_pages)
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
        System.out.println("Number of Pages:"+num_pages);
    }

 }

 public class bookdetails
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);   
        System.out.print("Enter the number of books:");
        int n=sc.nextInt();
        sc.nextLine();//Consumes buffer between string and int

        book[] books=new book[n];
        System.out.println("Enter the details of:");
        for (int i = 0; i < n; i++) 
        {
        System.out.println("\nBook " + (i + 1) + ":");

        System.out.print("Enter the Name of book: ");
        String name = sc.nextLine();

        System.out.print("Enter the Author of book: ");
        String author = sc.nextLine();

        System.out.print("Enter the Price of book: ");
        double price = sc.nextDouble();
        

        System.out.print("Enter the Number of pages of book: ");
        int num_pages = sc.nextInt();
        sc.nextLine(); //COnsumes buffer between string and int

        books[i] = new book(name, author, price, num_pages);
        }
        
        
        System.out.println("\nDetails of:");
        for(int i=0;i<n;i++)
        {
            System.out.println("\nBook"+(i+1)+":");
            books[i].display();
        }
    }
 }