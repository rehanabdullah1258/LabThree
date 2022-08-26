import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int day, monthe;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the mothe");
        monthe = input.nextInt();
        System.out.println("enter the day");
        day = input.nextInt();
        if (((monthe == 1) || (monthe == 2) || (monthe == 3)) && day >= 21)
            System.out.println("winter");
        else if (((monthe == 4) || (monthe == 5) || (monthe == 6)) && day <= 21)
            System.out.println("spring");
        else if (((monthe == 7) || (monthe == 8) || (monthe == 9)) && day <= 21)
            System.out.println("summer");
        else
            System.out.println("fall");

    }
}
