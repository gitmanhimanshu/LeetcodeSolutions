import java.util.Scanner;
import java.util.Stack;

class celebrity {
    boolean knows(int a[][],int b,int c){
        if(a[b][c]==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Stack<Integer> him = new Stack<>();
        celebrity h=new celebrity();
        Scanner sc = new Scanner(System.in);
        int ans=0;
        System.out.println("enter the number of cendidate");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            him.push(i);
        }
      
        
        System.out.println("entr the relation ship");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        while(him.size()>1){
            int b=him.peek();
            him.pop();
            int c=him.peek();
            him.pop();
            if(h.knows(a,b,c)){
                him.push(c);
            }
            else{
                him.push(b);
            }
        }
        int rowzero=0;
        int cendidatee=him.peek();
        for(int i=0;i<n;i++){
            if(a[cendidatee][i]==0){
                rowzero++;
            }
        }
        if(rowzero!=n){
            ans=-1;
        }
        int colzero=0;
        for(int i=0;i<n;i++){
            if(a[i][cendidatee]==1){
                colzero++;
            }
        }
        if(colzero!=n-1){
            ans=-1;
        }
        if(rowzero==n&&colzero==n-1){
            ans=cendidatee;
        }
        System.out.println("celebrity is "+ans);
    }
}
