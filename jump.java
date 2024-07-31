import java.util.Scanner;

class jump{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in );
     System.out.println("enter the lenfth");
 int n=sc.nextInt();

 int a[]=new int[n];
 System.out.println("enter the array");
 for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
 }
 int k=0;
 while(k<n){
if(a[k]==0){
    break;
}
else{
    int c=0;
    while(c<=a[k]){
        if(k==n-1){
            break;
        }
        else{
            k=k+c;
        }
    }
  
}
 }
 if(k==n-1){
    System.out.println("it reached "+k);
 }
 else{
    System.out.println("not raeched "+k);
 }
}
}