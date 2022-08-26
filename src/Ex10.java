import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int monthe;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the monthe");
        monthe= input.nextInt();
        if((monthe==1)||(monthe==3)||(monthe==4)||(monthe==5)||(monthe==6)||(monthe==7)||(monthe==8)||(monthe==9)||(monthe==10)||(monthe==11)||(monthe==12))
            System.out.println("30 days");
        else
            System.out.println("28 days");
    }
}
