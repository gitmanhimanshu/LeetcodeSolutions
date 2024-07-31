import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class revequ {
    public static void main(String[] args) {
        Stack<Integer> him=new Stack<>();
        Queue<Integer> sau=new LinkedList<>();
        sau.add(6);
         sau.add(7);
       sau.add(8);
        sau.add(9);
         sau.add(10);
        
System.out.println(sau);
        sau=rev(sau);
        System.out.println(sau);
    }
    static Queue<Integer> rev(Queue<Integer> q){
        if(q.isEmpty()){
            return null;
        }
        int n=q.peek();
        q.remove();
        rev(q);
        q.add(n);
        return q;
    }
}
