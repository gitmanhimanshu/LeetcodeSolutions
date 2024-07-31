import java.util.Scanner;

public class remzero {
    public static void main(String[] args)  {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int n=sc.nextInt();
    System.out.println("enter the elements of array");
    int a[]= new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int i=0,c;
    int k=0;
    while(i<n){
        if(a[i]!=0){
            c=a[i];
            a[i]=a[k];
            a[k]=c;
            k++;
        }
        i++;
    }
    for( i=0;i<n;i++){
        System.out.println(a[i]);
    }
    }
    
}
