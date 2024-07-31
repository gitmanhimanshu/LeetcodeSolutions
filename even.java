import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int ans=n/2;
        if(ans*2==n){
            System.out.println("it is even");
        }
        else{
            System.out.println("it is odd");
        }
    }
    
}
