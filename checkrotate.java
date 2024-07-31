import java.util.Scanner;

public class checkrotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the array elments");
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        checkrotate b=new checkrotate();
        System.out.println(b.check(a));
    }
    boolean check(int a[]){
        int  c=0;
        for(int i=1;i<a.length;i++){
            if(a[i-1]>a[i]){
                c=c+1;
            }
        }
        return c<=1;
    }
}
