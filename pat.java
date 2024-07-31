import java.util.Scanner;

class pat{
    public static void main(String[] args) {
       pat b=new pat();
       System.out.println("enter the row");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       b.tri(0, -1,n);
    }
    void tri(int r,int c,int n){
        if(r==n){
            return;
        }
        if(c<r){
            System.out.print("*");
            tri(r, c+1,n);
        }
        else{
            System.out.println();
            tri(r+1, -1,n);
        }
    }
}