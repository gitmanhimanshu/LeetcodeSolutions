import java.util.Scanner;

class counting{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the length of array");
      int n=sc.nextInt();
      int a[]=new int[n+1];
       int b[]=new int[n+1];
      System.out.println("enter the array elements");
      for(int i=1;i<a.length;i++){
        a[i]=sc.nextInt();
      } 
      int k=a[1];
      for(int i=1;i<a.length;i++){
        if(a[i]>k){
            k=a[i];
        }
      }
      int c[]=new int[k+1];
      for(int i=0;i<c.length;i++){
      c[i]=0;
      }
     for(int i=1;i<a.length;i++){
         c[a[i]]=c[a[i]]+1;
      }
      for(int i=1;i<c.length;i++){
      c[i]=c[i]+c[i-1];
     }
    
    for(int i=a.length-1;i>=1;i--){
        b[c[a[i]]--]=a[i];
      
    }
    for(int i=1;i<b.length;i++){
      System.out.print(b[i]+" ");
    }
    }
}