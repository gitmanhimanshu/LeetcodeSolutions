import java.util.Scanner;

public class bubblerec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the size of array");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sort(a, n);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    static void  sort(int b[],int n){
        if(n==0||n==1){
            return ;
        }
        for(int i=0;i<n-1;i++){
            if(b[i]>b[i+1]){
                int c=b[i];
                b[i]=b[i+1];
                b[i+1]=c;
            }
        }
         sort(b, n-1);
    }
}
