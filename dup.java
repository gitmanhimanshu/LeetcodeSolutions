import java.util.Scanner;

public class dup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements");
        for(int k=0;k<n;k++){
            a[k]=sc.nextInt();
        }
        int i=0,j=0;
        int count=0;
        while(i<=n){
            if(a[i]!=a[j]){
                a[j]=a[i];
                j++;
                count++;
            }
            i++;
        }
        System.out.println(" number = "+count);
        for(int k=0;k<n;k++){
            System.out.print(a[k]+" ");
        }
    }
    
}
