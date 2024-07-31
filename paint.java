import java.util.Scanner;

public class paint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        System.out.println("enter the time taken by the array");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter then painters number");
        int m = sc.nextInt();
        cal c=new cal();
        System.out.println(c.calculate(a, n, m));
    }

}

class cal {
    possible b=new possible();
    int calculate(int a[], int n, int m) {
        int s = 0, e= 0, ans = -1;
        for (int i = 0; i < n; i++) {
            e = e + a[i];
        }
        int mid;
        while (s <= e) {
            mid = (s + e) / 2;
            if (b.ispossible(a, n, m, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
s=mid+1;
            }
        }
        return ans;
    }
}
class possible{
    boolean ispossible(int a[],int n,int m,int mid){
        int sum=0,painter=1;
        for(int i=0;i<n;i++){
            if((sum+a[i])<=mid){
                sum=sum+a[i];
            }
            else{
                painter++;
                sum=a[i];
                if(sum>mid||painter>m){
                    return false;
                }
            }
        }
        return true;
    }
}