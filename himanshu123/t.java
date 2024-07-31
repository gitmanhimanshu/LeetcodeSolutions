import java.util.Scanner;

class t{
    public static void main(String[] args) {
        System.out.println("enter the length");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        t b=new t();
        b.sort(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    void swap(int a[],int i,int j){
        int c=a[i];
        a[i]=a[j];
        a[j]=c;
    }
    void sort(int a[]){
        int l=a.length;
        for(int i=l/2-1;i>=0;i--){
            max_heap(a, l, i);
        }
        for(int i=a.length-1;i>=0;i--){
           swap(a,i,0);
            max_heap(a, i, 0);
        }
    }
    void max_heap(int a[],int n,int i){
        int l=2*i+1;
        int r=2*i+2;
        if(l<n&&a[l]>a[i]){
            int largest=l;
         swap(a,i,l);
            max_heap(a, n, largest);
        }
         if(r<n&&a[r]>a[i]){
            int largest=r;
             swap(a,i,r);
            max_heap(a, n, largest);
        }
    }
}