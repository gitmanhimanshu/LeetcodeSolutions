import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class recsort {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the array elements");
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
     recsort b=new recsort();
    // if(b.issort(a,0,n-1)){
    //     System.out.println("array is sorted");
    // }
    // else{
    //     System.out.println("array is not sortd");
    // }
    System.out.println("enter the item to be search");
    int data=sc.nextInt();
   
  
    System.out.println( b.allpos(a, data, 0));
 }  
 boolean issort(int a[],int pos,int n){
            if(pos==n){
                return true;
            }
            if(a[pos]>a[pos+1]){
                return false;
            }
          return  issort(a, pos+1, n);
            
 }
 int pos(int a[],int data,int pos){
    if(pos==-1){
        return -1;
    }
    if(data==a[pos]){
        return pos;
    }
    return pos(a, data, pos-1);
 }
  
 ArrayList<Integer> allpos(int a[],int data,int pos){
    ArrayList<Integer> list=new ArrayList<>();
    if(pos==a.length){
        return list;
    }
    if(a[pos]==data){
        list.add(pos);
    }
   ArrayList<Integer> him= allpos(a, data, pos+1);
 list.addAll
 (him);
 return list;   
 }
}

