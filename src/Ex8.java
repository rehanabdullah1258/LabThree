import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
    String name;
    double salary;
    double hours;
    double sh;
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name");
        name=input.next();
        System.out.println("enter salary $$");
        salary=input.nextInt();
        System.out.println("enter hours");
        hours=input.nextInt();
        sh=(salary%150)/40;
        System.out.println(name);
        System.out.println(salary+sh+"$");


}}
