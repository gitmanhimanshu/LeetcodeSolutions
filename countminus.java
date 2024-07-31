import java.util.Scanner;

public class countminus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lemgth");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[n+1];
        int b[]=new int[n+1];
        for(int i=1;i<a.length;i++){
            a[i]=sc.nextInt();
            a[i]=a[i]*-1;
        }
      int k=a[1];
      for(int i=1;i<a.length;i++){
        if(a[i]>k){
            k=a[i];
        }
      }
      int c[]=new int [k+1];
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
   
    int s=1,e=a.length-1;
    while(s<e){
       int t=b[s];
       b[s]=b[e]*-1;
       b[e]=t*-1;
        s++;
        e--;

    }
     for(int i=1;i<b.length;i++){
        System.out.print(b[i]+" ");
    }
    }
}
    

