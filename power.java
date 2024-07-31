import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("enter the power");
        int p=sc.nextInt();
System.out.println(pow(n, p));
    }
    static int  pow(int n,int p){
        if(p==1){
            return n;
        }
        int ans=pow(n, p/2);
        if(p%2==0){
            return ans*ans;
        }
        else{
            return n*ans*ans;
        }
    }
}
