import java.util.Scanner;

class  rev{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the elements");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("enter the array elements");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
     int rev[]=revs(a);
   for(int i=0;i<n;i++){
    System.out.println(rev[i]);
   }
    }
    static int[]  revs(int a[]){
       int  s=0;
       int  e=a.length-1;
       while(s<=e){
        int c=a[s];
        a[s]=a[e];
        a[e]=c;
        s++;
        e--;
       }
       return a;


    }
}