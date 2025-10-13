import java.util.Scanner;

class calcGrade
{
    char grade;
    String name;
    calcGrade(String n)
    {
        name=n;
    }
    void calculateGrade(int marks)
    {
        grade=cal(marks);
    }
    void calculateGrade(int marks1,int marks2,int marks3)
    {
        double m=(double)(marks1+marks2+marks3)/3;
        System.out.println(name+"'s Grade:");
        System.out.println("Average:"+m);
        System.out.println("Grade 1:"+cal(marks1));
        System.out.println("Grade 2:"+cal(marks2));
        System.out.println("Grade 3:"+cal(marks3));
    }
    void calculateGrade(double percentage)
    {
        grade=cal(percentage);
    }
    char cal(double finalMarks)
    {
        return finalMarks>=90?'A':
               finalMarks>=80?'B':
               finalMarks>=70?'C':
               finalMarks>=60?'D':'E';
    }
    void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(name+"'s Grade:"+grade);
    }
}

public class grade
{
    public static void main(String[] args) 
    {
        calcGrade student1=new calcGrade("Student1");
        student1.calculateGrade(87);
        student1.display();

        calcGrade student2=new calcGrade("Student2");
        student2.calculateGrade(87,98,100);

        calcGrade student3=new calcGrade("Student3");
        student3.calculateGrade(76.88);
        student3.display();
    }
}