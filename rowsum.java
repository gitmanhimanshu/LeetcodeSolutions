import java.util.Scanner;

public class rowsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and coloumn of the arry");
        int r=sc.nextInt();
        int c=sc.nextInt();
      int a[][]=new int[r][c];
        System.out.println("enter the array elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int s[]=new int[c];
        for(int i=0;i<r;i++){
            s[i]=0;
            for(int j=0;j<c;j++){
                s[i]=s[i]+a[j][i];
            }
        }
        System.out.println("coloumn wise sum= ");
        for(int i=0;i<c;i++){
            System.out.println(s[i]);
        }
    }
    
}
