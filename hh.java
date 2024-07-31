import java.util.Scanner;

public class hh {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        hh b=new hh();
        b.sort(a);
        b.print(a);
    }
    void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    void sort(int a[]){
        int l=a.length;
        for(int i=l/2-1;i>=0;i--){
        max_heap(a, l, i);
        }
        for(int i=a.length-1;i>=0;i--){
            int c=a[i];
            a[i]=a[0];
            a[0]=c;
            max_heap(a, i, 0);
        }
    }
     void max_heap(int[] a,int n,int i){
        int l=2*i+1;
        int r=2*i+2;
        if(l<n&&a[l]>a[i]){
            int largest=l;
            int c=a[i];
            a[i]=a[l];
            a[l]=c;
            max_heap(a, n, l);
            
        }
   
        if(r<n&&a[r]>a[i]){
            int largest=r;
            int c=a[i];
            a[i]=a[r];
            a[r]=c;
            max_heap(a, n, r);
            
        }
    }
}
