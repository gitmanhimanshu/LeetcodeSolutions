import java.util.Scanner;

public class q1 {
    node front=null,rear=null;
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int c=1;
q1 b=new q1();
while(c==1){
    System.out.println("enter the person");
    int data=sc.nextInt();
 b.enque(data);
  System.out.println("1=more 2= no");
   c=sc.nextInt();

}
b.show();
b.deque();
System.out.println();
b.show();
b.enque(1);
System.out.println();
b.show();
b.enque(4);
System.out.println();
b.show();
b.deque();
System.out.println();
b.show();    }
    void show(){
        if(front==null){
            System.out.println("no data");
        }
        else{
            node i=front;
            while(i!=null){
                System.out.print(i.data+" ");
                i=i.next;
            }
        }
    }
     void deque(){
        if(front==null){
            System.out.println("no data");
        }
        else{
            front=front.next;
        }
    }
     void enque(int data){
        node newnode=new node(data);
        if(front==null){
            front=rear=newnode;

        }
        else{
            rear.next=newnode;
            rear=newnode;
        }
    }

}
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
