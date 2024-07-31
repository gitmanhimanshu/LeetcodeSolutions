import java.util.Scanner;

public class binsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        squarecal a=new squarecal();
        int ans=a.square_cal(n);
        System.out.println("square root= "+ans);

    }
    
}
class squarecal{
    int square_cal(int n){
        int l=0,u=n,mid,ans=-1;
        while(l<=u){
            mid=(l+u)/2;
            if(mid*mid==n){
            ans= mid;
            return ans;
            }
            else if(mid*mid>n){
             u=mid-1;
            }
            else{
                ans=mid;
                l=mid+1;

            }
        }
        return ans;
    }
}