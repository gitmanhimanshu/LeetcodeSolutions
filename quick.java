import java.util.Scanner;

class quick{
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        quicks(a, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
 
    static int partition(int a[],int lb,int ub){
        int start=lb;
        int end=ub;
        int pivot=a[lb];
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
        int c=a[lb];
        a[lb]=a[end];
        a[end]=c;
        return end;
    }
    static void quicks(int a[],int start,int end){
        if(start>=end){
            return;
        }
        int p=partition(a, start, end);
        quicks(a, start, p-1);
        quicks(a, p+1, end);
    }
}