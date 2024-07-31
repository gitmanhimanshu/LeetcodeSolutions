import java.util.Scanner;

public class co {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println(getsum(n,0));
    }
    static int getsum(int n,int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return getsum(n/2, steps+1);
        }
        else{
            return getsum(n-1, steps+1);
        }

    }
    
}
