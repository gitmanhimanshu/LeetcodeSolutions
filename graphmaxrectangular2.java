import java.util.Scanner;
import java.util.Stack;

public class graphmaxrectangular2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        graphmaxrectangular2 b=new graphmaxrectangular2();
        System.out.println(b.largestRectangleArea(a));
    }
    int largestRectangleArea(int heights[]){
        int n=heights.length;
        
        int next[]=new int[n];
        int prev[]=new int[n];
        next=nextindex(heights, n);
        prev=previndex(heights, n);
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
          
            int length=heights[i];
            if(next[i]==-1){
                next[i]=n;
            }
              int breath=next[i]-prev[i]-1;
              int area=length*breath;
              ans=Math.max(area, ans);
        }
        return ans;
    }
    int [] nextindex(int a[],int n){
        Stack<Integer> him=new Stack<>();
        him.push(-1);
        int ans[]=new int [n];
        for(int i=n-1;i>=0;i--){
            int curr=a[i];
            while(him.peek()!=-1&&curr<=a[him.peek()]){
                him.pop();
            }
            ans[i]=him.peek();
            him.push(i);
        }
        return ans;
    }
     int [] previndex(int a[],int n){
        Stack<Integer> him=new Stack<>();
        him.push(-1);
        int ans[]=new int [n];
        for(int i=0;i<n;i++){
            int curr=a[i];
            while(him.peek()!=-1&&curr<=a[him.peek()]){
                him.pop();
            }
            ans[i]=him.peek();
            him.push(i);
        }
        return ans;
    }
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int area=largestRectangleArea(M[0],m);
            for(int i=1;i<n;i++){
                for(int j=0;j<m;j++){
                    if(M[i][j]!=0){
                        M[i][j]=M[i][j]+M[i-1][j];
                    }
                    else{
                        M[i][j]=0;
                    }
                }
                area=Math.max(area,largestRectangleArea(M[i],m));
            }
            return area; 
            
        }
    
}
