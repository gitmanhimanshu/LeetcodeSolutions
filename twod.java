import java.util.Scanner;

public class twod {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the row of array");
     int r=sc.nextInt();
     System.out.println("enter the coloumn of array");
     int c=sc.nextInt();
     int a[][]=new int[r][c];
     System.out.println("enter the array elements");
     for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            a[i][j]=sc.nextInt();
        }
    }
        int l=0;
        int s=0,e=c-1;
        while(s<=e){
            if(s%2==0){
        while(l!=c){
            System.out.print(a[l][s]+" ");
            l++;
        }
        s++;
        l--;
            }
            else{
                while(l!=-1){
                    System.out.print(a[l][s]+" ");
                    l--;
                }
                s++;
                l++;
            }

        }
     }

    }
    

