import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int number1,number2,number3;
        Scanner input=new Scanner(System.in);
        System.out.println("enter three numbers");
        number1=input.nextInt();
        number2=input.nextInt();
        number3=input.nextInt();
        if((number1==number2)&&(number1==number3)&&(number2==number3))
            System.out.println("all the same");
        else if((number1!=number2)&&(number1!=number3)&&(number2!=number3))
            System.out.println("all different");
         else
            System.out.println("neither");

    }
}
