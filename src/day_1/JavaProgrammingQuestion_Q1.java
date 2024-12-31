package day_1;
import java.util.Scanner;
public class JavaProgrammingQuestion_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        char name=sc.next().charAt(0);
        System.out.println("Marks of m1 : ");
        int m1=sc.nextInt();
        System.out.println("Marks of m2 : ");
        int m2=sc.nextInt();
        System.out.println("Marks of m3 : ");
        int m3=sc.nextInt();
        int avg=(m1+m2+m3)/3;
        System.out.println(name);
        System.out.println(avg);
    }
}
