import java.util.Scanner;

public class quick1 {
    public static void main(String[] args) {
          
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        quickss(a, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }  
       
        
    }
static void quickss(int a[],int s,int e){
    if(s>=e){
        return;
    }
    int loc=partition(a,s,e);
    quickss(a, s, loc-1);
    quickss(a, loc+1, e);
}
static int partition(int a[],int lb,int ub){
    int pivot=a[lb];
    int start=lb;
    int end=ub;
    while(start<end){
        while(a[start]<=pivot){
            start++;
        }
        while(a[end]>pivot){
            end--;
        }
        if(start<end){
            int c=a[start];
            a[start]=a[end];
            a[end]=c;
        }
    }
    int c=a[end];
    a[end]=a[lb];
    a[lb]=c;
    return end;
}
}
