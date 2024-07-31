import java.util.Arrays;
import java.util.PriorityQueue;
class Pair implements Comparable<Pair>{
    int profit;
    int dif;
    Pair(int profit,int dif){
        this.profit=profit;
        this.dif=dif;
    }
   public int compareTo(Pair that){
    return that.profit-this.profit;
   }
}
public class maxprofit {
    public static void main(String[] args) {
        int dif[]=new int[]{2,6,4,8,10};
        int profit[]=new int[]{10,30,20,40,50};
        int work[]=new int[]{4,7,5,6};
    
        PriorityQueue<Pair> him=new PriorityQueue<>();
     for(int i=0;i<dif.length;i++){
        him.add(new Pair(profit[i], dif[i]));
     }
     Arrays.sort(work);
     int ans=0;
     for(int i=work.length-1;i>=0;i--){
        while(work[i]<him.peek().dif){
            him.poll();
        }
        ans+=him.peek().profit;
     }
     System.out.println(ans);
    }
}
