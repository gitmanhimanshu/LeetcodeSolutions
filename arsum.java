import java.util.Scanner;

public class arsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenght of array");
        int n=sc.nextInt();
        System.out.println("enter the array elemnts");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        arsum b=new arsum();

        System.out.println("enter  the sum");
        int s=sc.nextInt();
        int ans=b.asum(a, s,n);
        for(int i=0;i<=ans;i++){
            System.out.println(a[i]);
        }

    }
    int asum(int a[],int key,int n){
        int sum=0,v=-1;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            if(sum==key){
                v=i;
                break;
            }
           
        }
         return v;
    }
    
}
