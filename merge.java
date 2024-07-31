import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of aaray a");
    int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
          
        System.out.println("enter the size of array b");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("enter the array elements");
    for(int i=0;i<m;i++){
        b[i]=sc.nextInt();
    }
        int c[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;  
            }       
            else{
                c[k]=b[j];
                k++; j++;
            }
            if(i<n&&j>(m-1)){
                while(i<n){
              c[k]=a[i];
              k++ ; i++;
                }
            }
            if(j<m&&i>(n-1)){
                while(j<m){
                    c[k]=b[j];
                    j++; k++;
                }
            }
            
        }
        for(int h=0;h<(n+m);h++){
            System.out.println(c[h]);
        }
    }
    
}
