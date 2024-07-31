import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queuekrev {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        
        q.add(1);
          q.add(2);
            q.add(3);
              q.add(4);
                q.add(5);
                
                  int k=3;
                  int n=q.size();
                  System.out.println(q);
                 int i=0;
while(i<k){
    int e=q.peek();
    q.remove();
    s.push(e);
    i++;
}
i=0;
while(i<k){
    int e=s.peek();
    s.pop();
    q.add(e);
    i++;
}
i=0;
while(i<n-k){
    int e=q.peek();
    q.remove();
   q.add(e);
    i++;
}


System.out.println(q);
    }
    
}
