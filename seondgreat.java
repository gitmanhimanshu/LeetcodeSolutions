import java.util.Scanner;

public class seondgreat {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the a ,b ,c ");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
      if((a>b&&a<c)||(a>c&&a<b)){
        System.out.println(" a is second greater"+a);
      }
      else if((b>c&&b<a)||(b>a&&b<c)){
        System.out.println(" b is second greater "+b);
      }
      else{
        System.out.println(" c is second greater "+c);
      }
}
}
