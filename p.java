import java.util.Scanner;
public class p {
      public static void main(String[] args) {
         int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        System.out.println("enter the aray elements");
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int p=max(a,n);
        System.out.println(" max element is "+a[p]);
    
    }
     static int max(int a[],int n){
        int l=0,u=n-1;
        int mid;
           mid=(l+u)/2;
       while(l<u){
        if(a[mid]<a[mid+1]){
            l=mid+1;
        }
        else{
            u=mid;
        }

       }
       return l;
}
}

