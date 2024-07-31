import java.util.Scanner;

class shel{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the length of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int d=(n+1)/2;
        for(int i=d;i>0;i=i/2){
            for(int j=i;j<n;j++){
                int value=a[j];
               int k=j-i;
                while(k>=0&&a[k]>value){
                    a[k+i]=a[k];
                    k=k-i;
                }
                a[k+i]=value;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}