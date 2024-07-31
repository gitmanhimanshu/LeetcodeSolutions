import java.util.Scanner;

public class graphmaxrexctangular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int breath;
        int area=Integer.MIN_VALUE;
       
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int j=i;
            int length=a[i];
            int k=i;
            int prev=0;
            int next=0;
            while(j>=0&&a[i]<=a[j]){
                prev++;
                j--;
            }
            while (k<n&&a[i]<=a[k]) {
               next++;
               k++; 
            }
            breath=prev+next-1;
            int total=a[i]*breath;
            area=Math.max(total, area);
        }
        System.out.println("Total rectangular area is "+area);
    }
}
