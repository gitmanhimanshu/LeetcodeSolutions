import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        rotate b=new rotate();
        a=b.rotatear(a,2);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    
    }
   int [] rotatear(int a[],int key){
    int temp[]=new int[a.length];
    for(int i=0;i<a.length;i++){
        temp[(i+key)%(a.length)]=a[i];
    }
    a=temp;
    return a;
   }
}
