import java.util.Scanner;

class mergeli{
    Node head1=null,head2=null,headd=null;
    Node solve(Node first,Node Second)
    {
        Node curr1=first;
        Node curr2=Second;
        Node next1=first.next;
        Node next2=Second.next;
        while(next1!=null&&curr2!=null){
            if(curr2.data>=curr1.data&&curr2.data<=next1.data){
                curr1.next=curr2;
                next2=curr2.next;
                curr2.next=next1;
                curr1=curr2;
                curr2=next1.next;

            }
            else{
                curr1=next1;
                next1=next1.next;
                if (next1==null) {
                 curr1.next=curr2;
                 return first;   
                }
            }
        }
        return first;

    }
    Node sort(Node first,Node Second){
        if(first==null){
            return Second;
        }
        if(Second==null){
            return first;
        }
        if(first.data<=Second.data){
           return solve(first,Second);
        }
        else{
           return solve(Second,first);
        }
    }
    
    Node create(Node head,int data){
      
        Node newNode=new Node(data);
         Node temp=null;
          if(head==null){
            head=temp=newNode;
          }else{
            temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
          }
          return head;
}
 void print(Node head){
    if(head==null){
        return;
    }
    else{
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
 }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int c=1;
    mergeli b=new mergeli();
    while(c==1){
        System.out.println("enter the data");
        int data=sc.nextInt();
        b.head1=b.create(b.head1, data);
      System.out.println("1=more\n 2= no");
      c=sc.nextInt();
    }
    c=1;
    System.out.println("enter the 2nd list");
     while(c==1){
        System.out.println("enter the data");
        int data=sc.nextInt();
        b.head2=b.create(b.head2, data);
      System.out.println("1=more\n 2= no");
      c=sc.nextInt();
    }
      System.out.println(" 1st list ");
        b.print(b.head1);
          System.out.println(" 2nd list ");
        b.print(b.head2);
        b.headd=b.solve(b.head1, b.head2);
        System.out.println("after merging \n");
        b.print(b.headd);

}
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}