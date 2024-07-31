import java.util.Scanner;

public class recsum 

{static int sum1=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         recsum b=new recsum();
        System.out.println(sum(n));
       

    }
    static int sum(int n){
    
        if(n==0){
            return 0;
        }
        int digit=n%10;
        sum1=sum1*10+digit;
        sum(n/10);
return sum1;
    }
    
    
}
