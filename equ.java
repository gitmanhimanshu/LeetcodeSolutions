import java.util.Scanner;

public class equ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a b and c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double r=sqrt(b*b-(4*a*c));
        System.out.println(r);

    }
    
}
