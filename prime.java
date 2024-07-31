import java.util.Scanner;

public class prime {public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int c=0;
    System.out.println("enter the length");
    int n=sc.nextInt();
    boolean p[]=new boolean[n+1];  
    for(int i=0;i<=n;i++){
        p[i]=true;
    }
        p[0]=p[1]=false;
    int i=2;
    while(i<=(n)){
        if(p[i]==true){
            c++;
            for(int j=i*2;j<=n;j=j+i){
                p[i]=false;
            }
        }
        i++;
    }

System.out.println(c);
}
    
}
