import java.util.Scanner;

class heap2{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        heap2 b=new heap2();
        b.sort(a,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    void swap(int a[],int i,int j){
        int c=a[i];
        a[i]=a[j];
        a[j]=c;
    }
    void sort(int a[],int n){
        for(int i=(n/2)-1;i>=0;i--){
            maxheap(a, n, i);
        }
        for(int i=n-1;i>=0;i--){
            swap(a, i, 0);
            maxheap(a, n, 0);
        }
    }
    void maxheap(int a[],int n,int i){
        int left=2*i+1;
        int ri=2*i+2;
        if(left<n&&a[left]<a[i]){
            int largest=left;
            swap(a,left,i);
            maxheap(a, n, largest);
        }
         if(ri<n&&a[ri]<a[i]){
            int largest=ri;
            swap(a,ri,i);
            maxheap(a, n, largest);
        }

    }
}