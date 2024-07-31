import java.util.Scanner;

public class spiral2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and coloumn");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter the array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int count=0;
        int total=r*c;
        int rs=0,rl=r-1;
        int cs=0,cl=c-1;
        while(count<total){
            for(int i=rs;i<=rl&&count<total;i++){
                System.out.print(a[cs][i]+" ");
                count++;
            }
            cs++;
            for(int i=cs;i<=cl && count<total;i++){
                System.out.print(a[i][rl]+" ");
            count++;
            }
            rl--;
            for(int i=rl;i>=rs &&count<total;i--){
                System.out.print(a[cl][i]+" ");
                count++;
            }
            cl--;
            for(int i=cl;i>=cs&&count<total;i--){
                System.out.print(a[i][rs]+" ");
                count++;
            }
            rs++;




        }

    }
    
}
