import java.util.Stack;

class s{
    public static void main(String[] args) {
    Stack<Integer> b=new Stack<>();
    s b=new s();
  b.push(5);
  b.push(7);
  b.push(9);
  b.push(10);
 
    b.print(b);
    }
    void print(s b){
        while(!b.isempty()){
            System.out.println(b.pop());
        }
    }
    void del(Stack<Integer> b,int count,int size){

    }
}