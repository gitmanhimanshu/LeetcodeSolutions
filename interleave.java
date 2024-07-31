import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class interleave {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> arr=new ArrayList<>();

        q.add(3);
        q.add(5);
        // q.add(3);
        // q.add(1);
        int s=0;
                int n=q.size()/2;
        Queue<Integer> q1=new LinkedList<>();
        while(s<n){
            q1.add(q.peek());
            q.remove();
            s++;
        }
        int a=0;
        while(!q.isEmpty()||!q1.isEmpty()){
         if(a==0){
            arr.add(q1.peek());
            q1.remove();
            a=1;
         }else{
            arr.add(q.peek());
            q.remove();
            a=0;
         }   

        }
System.out.println(arr);

    }
    
}
