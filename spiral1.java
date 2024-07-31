import java.util.Scanner;

public class spiral1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and coloumn");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("enter the array elements");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int total=r*c;
        int count=0;
        int cs=0,cl=c-1;
        int rs=0,rl=r-1;
        while(count<total){
            for(int i=c;i<=cl&& count<total ;i++){
                System.out.print(a[cs][i]+" ");
                count++;
            } 
            c++;
            
            for(int i=c;i<=rl&& count<total ;i++){
                System.out.println(a[i][rl]+" ");
                count++;
            }
            rl--;
             for(int i=rl; i>=r&& count<total ;i--){
                System.out.println(a[cl][i]+" ");
                count++;
            }cl--;
             for(int i=r;i>=c&& count<total ;i--){
                System.out.println(a[i][r]+" ");
                count++;
            }
            r++;

        }
    }
}
