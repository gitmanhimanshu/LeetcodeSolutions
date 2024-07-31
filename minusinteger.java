import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class minusinteger{
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();

       Scanner sc=new Scanner(System.in);
       System.out.println("enter the length ");
       int n=sc.nextInt();
       System.out.println("enter the array elements");
       int a[]=new int[n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       }
       int l=0;
       System.out.println("enter the cycle");
       int k=sc.nextInt();
       int ans[]=new int[n-k+1];
       for(int i=0;i<k;i++){
        if(a[i]<0){
            dq.addLast(i);
        }
       }
       if(dq.size()>0){
        ans[l]=a[dq.peek()];
        l++;
       }else{
        ans[l]=0;
        l++;
       }
       for(int i=k;i<n;i++){
        if(!dq.isEmpty()&&i-dq.peek()>=k){
            dq.removeFirst();
        }
        if(a[i]<0){
            dq.addLast(i);
        }
       
       if(dq.size()>0){
          ans[l]=a[dq.peek()];
          l++;
       }else{
         ans[l]=0;l++;
       }
    
       }
       for(int i=0;i<ans.length;i++){
        System.out.print(" "+ans[i]);
       }
    }
}