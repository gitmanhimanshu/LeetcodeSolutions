import java.util.Scanner;

public class shell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        int a[]=new int[n];
        // System.out.println("enter the elements");
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        int d=(int) Math.ceil((n+1)/2);
       for(int i=d;i>1;i=(int)Math.ceil(d/2)){
        System.out.println(i);
       }
    }
    
}
