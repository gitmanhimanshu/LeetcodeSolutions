import java.util.Scanner;

public class max{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the array length");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int reach=0;
        for(int i=0;i<n;i++){
            if(reach<i)
        {
            System.out.println("no reacah");
        }
        else{
            reach=Math.max(reach, i+a[i]);    
        }

        }
        System.out.println(reach);
    }
    
}
