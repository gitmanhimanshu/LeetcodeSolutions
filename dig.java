import java.util.Scanner;

public class dig {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the array elementts");
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}

System.out.println(sum(a,n-1));
    }
  static  int sum(int a[],int i){
        if(i==0){
            return a[0];
        }
        
else{
    return a[i]+sum(a, i-1);
    
}
    }
}