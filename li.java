import java.util.Scanner;

public class li {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter element to be search");
        int key=sc.nextInt();
        int s=0;
        int pos=search(a, key,s, n-1);
        if(pos>=0){
            System.out.println(pos);
        }
        else{
            System.out.println("position not found");
        }
    }
    static int search(int a[],int key,int s,int e){
        int mid=(s+e)/2;
        if(s>e){
            return -1;
        }
        if(a[mid]==key){
            return mid;
        }
        else if(a[mid]>key){
            return search(a, key, s, mid-1);
        }
        else{
            return search(a, key, mid+1, e);
        }

       
  
    }
    
}
