import java.util.Scanner;

public class binsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenght of array");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       System.out.println("enter the sum to be want");
       int sum=sc.nextInt();
       binsum b=new binsum();
       int p=b.findloc(a,0,n,sum);
       for(int i=0;i<p;i++){
        System.out.println(a[i]);
       }
    }

    int findloc(int a[],int l,int n,int sum){
    int u=n-1;
        int pos=-1;
        while(l<=u){
            int mid=(l+u)/2;
            int s=0;
            for(int i=0;i<mid;i++){
                s=s+a[i];
            }
            if(s==sum){
                pos=mid;
                return pos;
            }
            else if(s>sum){
                u=mid-1;
            }
            else{
                pos=mid;
                l=mid+1;
            }
        }
        return pos;
    }
}
