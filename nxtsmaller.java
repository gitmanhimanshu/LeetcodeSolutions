import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nxtsmaller {
   int st[]=new int[50],top=0;
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        nxtsmaller b=new nxtsmaller();
         b.st[0]=-1;
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int c[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            int curr=a[i];
            while (b.st[b.top]>=curr) {
                b.pop();
            }
            c[i]=b.st[b.top];
            b.push(curr);
            
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+c[i]);
        }
}
void push(int data){
    if(top==50){
   System.out.println("full");
    }
    else{
     top++;
     st[top]=data;
    }
 }
 void pop(){
    if(top==0){
        System.out.println("no elements");
    }
    else{
        int data=st[top];
        top--;
    }
}
}