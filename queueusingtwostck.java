import java.util.Stack;

public class queueusingtwostck {
   static Stack <Integer> first=new Stack<>();
    static Stack <Integer> second=new Stack<>();
    public static void main(String[] args) {
        first.push(4);
        
    }
    static void push(int data){
        first.push(data);
    }
    static int  pop(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int remove=second.pop();
        while(second.isEmpty()){
            first.push(second.pop());
        }
      }
      
}
