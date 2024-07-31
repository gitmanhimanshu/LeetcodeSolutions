import java.util.Scanner;

class doubly{
    Node head=null,temp=null;
    void add(int data){
        Node neeNode=new Node(data);
        
        if(head==null){
            head=temp=neeNode;
        }
        else{
            temp.next=neeNode;
            neeNode.prev=temp;
            temp=neeNode;
            
        }
        temp.next=head;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        int c=1;
        doubly b=new doubly();
        while(c==1){
            System.out.println("enter data");
            int   data=sc.nextInt();
            b.add(data);
            System.out.println("1=true  2=false");
            c=sc.nextInt();
            
          

        }
        System.out.println();
        System.out.println("lopp is start at "+b.findloop().data);
    }
Node findloop(){
    Node first=head;
    Node second=isdetect();
    while(first!=second){
        first=first.next;
        second=second.next;
       
      
    }
      return first;
    
}
    Node isdetect(){
        Node first=head;
        Node second=head;
        while(second !=null &&first != null){
            first=first.next;
            second=second.next;
        if(second!=null){
            second=second.next;
        }
        if(first==second){
            return first;
        }
        }
        return null;
    }
    void print(){
        Node temp=head;
        if(temp==null){
            return;
        }
        else{
            while(temp!=null){
          
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
}
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;

    }
}