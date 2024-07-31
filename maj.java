import java.util.Scanner;
public class maj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0,cand=a[0];
        for(int i=0;i<n;i++){
            if(count ==0){
                cand=a[i];
                count++;
            }
                if(cand ==a[i]){
                    count++;
                }
                else{
                    count--;
                }
        }
        System.out.println("maximaum elements is "+cand);
        var b="him";
        System.out.println(b);
    }
    
}
