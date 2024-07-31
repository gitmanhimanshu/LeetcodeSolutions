import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class firstnonreapeat {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
       HashMap<Character,Integer> count=new HashMap<>();
       String A="himanshu";
       String s="";
       for(int i=0;i<A.length();i++){
        char ch=A.charAt(i);
        count.put(ch, count.getOrDefault(ch, 0) + 1);
        q.add(count.get(ch));
        while(!q.isEmpty()){
            if(q.peek()>1){
                q.remove();
            }
            else{
                s=s+count.
            }
        }

       }
    }
    
}
