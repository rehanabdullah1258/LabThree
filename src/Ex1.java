public class Ex1 {
    public static void main(String[] args) {
        int n=1;
        int m=-1;
        double x=0;
        double y=1;
        if (n<-m)
            System.out.println("a_"+n);
        else
        System.out.println("a_"+m);
        if (-n>=m)
            System.out.println("b_"+n);
        else
            System.out.println("b_"+m);
        if(Math.abs(x-y)<1)
            System.out.println("c_"+x);
        else
        System.out.println("c_"+y);
        x=Math.sqrt(2);
        y=2;
        if(x*x==y)
            System.out.println("d_"+x);
        else
            System.out.println("d_"+y);

    }
}
