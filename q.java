import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class q{
   int q[]=new int[6];
   int front=-1;
   int rear=-1;
   int n=6;
  
    public static void main(String[] args) {
        Stack<Integer> him=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int c=1;
         q b=new q();
        while(c==1){
            System.out.println("enter the data");
            int data=sc.nextInt();
            b.enque(data);
            System.out.println("1=more 2=no");
            c=sc.nextInt();
        }
       while(!q.isEmpty()){
        
    }
    void print(){
        if(isEmpty()){
            System.out.println("no elements");
        }
        else{
            int i=front;
            while(i!=rear){
                System.out.print(" "+q[i]);
                i=(i+1)%n;
            }
            System.out.print(" "+q[i]);
        }
    }
boolean isEmpty(){
    if(front ==-1){
        return true;
    }
    else{
        return false;
    }
}
boolean isfull(){
    if(rear==n-1){
        return true;
    }
    else{
        return false;
    }
}
    void enque(int data){
        if(isfull()){
            System.out.println("no space");
            return;
        }
        if(isEmpty()){
            front++;
            rear=rear+1;
            q[(rear)%n]=data;
        }
        else{
            rear=(rear+1)%n;
            q[rear%n]=data;
        }
    }
    void deque(){
        if(isEmpty()){
            System.out.println("no elements");
        }
        else{
          
            if(front==rear){
                front=rear=-1;
            }
            else{
                front=(front+1)%n;
            }
        }
    }
}