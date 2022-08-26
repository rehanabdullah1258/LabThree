import java.util.Scanner;
public class Ex3 {
public static void main(String[]args){
    int number;
    Scanner input=new Scanner(System.in);
    System.out.println("enter the number");
    number=input.nextInt();
    if(number<0)
        System.out.println("negativ");
    else if(number>0)
        System.out.println("positive");
    else System.out.println("0");


}}
