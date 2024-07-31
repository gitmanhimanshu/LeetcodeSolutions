import java.util.Scanner;

public class printr2dmat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and coloumn");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter the array elememnts");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        pr(a[1]);
        
    }
    static void pr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
    }
    
}
