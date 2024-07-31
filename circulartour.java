import java.util.Scanner;

public class circulartour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int petrol[]=new int[n];
        int distance[]=new int[n];
        System.out.println("enter the petrol");
        for(int i=0;i<n;i++){
            petrol[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            distance[i]=sc.nextInt();
        }
        int start=0;
        int kami=0;
        int balance=0;
        for(int i=0;i<n;i++){
            balance=balance+petrol[i]-distance[i];
        
            if(balance<0){
                start=i+1;
                kami=balance;
                balance=0;
            }
        }
        if(balance+kami>=0){
            System.out.println("start is "+start);
        }
        else{
            System.out.println(" -1");
        }

        
    }
    
}
