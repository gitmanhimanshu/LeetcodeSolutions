import java.util.Scanner;

public class heap {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        System.out.println("enter the array elemnts");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        heap b=new heap();
        b.sort(a);
        b.print(a);
        
    }
 void max_heap(int a[],int n,int i){
    int l=2*i+1;
    int r=2*i+2;
    if(l<n&&a[l]>a[i]){
        int largest=l;
        int c=a[l];
        a[l]=a[i];
        a[i]=c;
        max_heap(a, n, l);
    }
    if(r<n&&a[r]>a[i]){
          int largest=r;
        int c=a[r];
        a[r]=a[i];
        a[i]=c;
        max_heap(a, n, r);
    }
 }
 void sort(int a[]){
    int length=a.length;
    for(int i=length/2-1;i>=0;i--){
        max_heap(a, a.length, i);
    }
    for(int i=a.length-1;i>=0;i--){
        int c=a[i];
        a[i]=a[0];
        a[0]=c;
        max_heap(a, i, 0);
    }
 }
 void print(int a[]){
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]+" ");
    }
 }
    
    
}
