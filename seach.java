import java.util.Scanner;

public class seach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("emter the row and coloumn ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter the array elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }  
        System.out.println("enter the target ");
        int target=sc.nextInt();
        seach b=new seach();
        int rw=b.row(a, target);
        int cl=b.ind(a,target,rw);
        System.out.println(" position is "+(rw)+" "+(cl));
    }
    int row(int a[][],int target){
        int row=a.length;
        int col=a[0].length;
        int s=0,e=row-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid][0]<=target&&a[mid][col-1]>=target){
                return  mid;
            }
            if(a[mid][0]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
    int ind(int a[][],int target,int row){
        int col=a[0].length;
        int s=0,e=col-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(a[row][mid]==target){
                return mid;
            }
            if(a[row][mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
        
    }
}
