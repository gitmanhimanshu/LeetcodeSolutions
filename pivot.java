import java.util.Scanner;

public class pivot {
    public static void main(String[] args) {
        int l,i;
        Scanner sc=new Scanner(System.in);
      System.out.println("enter the lenght");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(i=0;i<n;i++){
        a[i]=sc.nextInt();
      } 
      pivot b=new pivot();
      int p=b.pivot(a , n) ;
     System.out.println("enter the element to be search");
     int key=sc.nextInt();
     if(key>=a[p]&&key<=a[n-1]){
         l=b.bin_search(a, p,n-1, key);
     }
     else{
     l=b.bin_search(a, 0,p-1, key);
     }
System.out.println("location ="+l);
    }
    int pivot(int a[],int n){
        int l=0,u=n-1,mid;
        while(l<u){
            mid=(l+u)/2;
            if(a[mid]>=a[mid+1])
            {
                l=mid+1;
            }
            else{
                u=mid;
            }
            mid=(l+u)/2;
        }
        return l;
    } 
     int bin_search(int a[],int l, int n, int key) {
        int  u = n - 1;
        int mid;
        while (l <= u) {
            mid = (u + l) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                u = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return -1;
    }
    
}
