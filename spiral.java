import java.util.Scanner;

class spiral{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row ");
        int row=sc.nextInt();
        System.out.println("enter the cloumn");
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        System.out.println("enter the elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int r=0,c=0,rl=col-1,cl=row-1;
        while(r<=rl &&c<=cl){
            for(int i=r;i<=rl;i++){
                System.out.print(a[r][i]);
            }
            c++;
            for(int i=c;i<=cl;i++ ){
                System.out.print(a[i][rl]);
            }
            rl--;
            if(r<=rl){
            for(int i=rl;i>=r;i--){
                System.out.print(a[cl][i]);
            }
            cl--;
        }
        if(c<=cl){
            for(int i=cl;i>=c;i--){
                System.out.print(a[i][r]);
            }
            r++; }       }
    }
}