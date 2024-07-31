import java.util.Scanner;

class srch2daray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row of the aray");
        int r = sc.nextInt();
        System.out.println("enter the coloumn of the array");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("enter the array elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the element to be search");
        int key=sc.nextInt();
        srch2daray b=new srch2daray();
        int row=b.bin_rowsearch(a, r, c, key);
        int col=b.bin_search(a,row,c,key);
        System.out.println("position is ="+(row)+" "+(col));

    }

    int bin_rowsearch(int a[][],int rb,int cb,int key){
        int lb=0;
        int ub=rb-1;
        int mid;
       while(lb<=ub){
        mid=(lb+ub)/2;
    if(key>=a[mid][0]&&key<=a[mid][cb-1]){
        return mid;
    }
    if(key<a[mid][0]){
        ub=mid-1;
    }
    else{
        lb=mid+1;
    }
    mid=(lb+ub)/2;
    }
    return -1;

    }

    int bin_search(int a[][],int row,int cb,int key){
       int  lb=0;
       int ub=cb-1;
        while(lb<=ub){
            int mid=(lb+ub)/2;
            if(a[row][mid]==key){
                return mid;
            }
            if(a[row][mid]>key){
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }
        return -1;

    }
}