import java.util.*;
import java.util.PriorityQueue;
class Pair<I,T> implements Comparable<Pair>{
    int p;
    int r;
    Pair(int p,int r){
        this.p=p;
        this.r=r;
    }
   public String toString(){
    return  "{"+this.p+" "+this.r+"}";
   }
   public int compareTo(Pair )
}
public class comparable {
    public static void main(String[] args) {
    Queue<Pair<Integer,Integer>> him=new LinkedList<>();
     him.add(new Pair<>(1,7));
     him.add(new Pair<>(3,7));
     him.add(new Pair<>(7,1));
him.add(new Pair<>(3,6));
     System.out.println(him);
    }
    
}
