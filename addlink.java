import java.util.Scanner;

class addlink{
    Node head1=null,head2=null,head3=null;
    Node rev(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
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
    addlink b=new addlink();
    while(c==1){
        System.out.println("enter the data");
        int data=sc.nextInt();
       b.head1= b.create(b.head1,data);
        System.out.println("1=more 2=no");
        c=sc.nextInt();
    }
    c=1;
     while(c==1){
        System.out.println(" 2nd enter the data");
        int data=sc.nextInt();
       b.head2= b.create(b.head2,data);
        System.out.println("1=more 2=no");
        c=sc.nextInt();
    }
 b.print(b.head1);
 System.out.println();
 b.print(b.head2);
 b.head1=b.rev(b.head1);
 b.head2=b.rev(b.head2);
 b.head3=b.add(b.head1, b.head2);
 System.out.println();
 b.print(b.head3);

 
}
int len(Node head){
    if(head==null){
        return 0;
    }
    Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
}
Node add(Node head1,Node head2){
  Node temp1=head1;
  Node temp2=head2;
  int c=0,digit,sum=0;
  while(temp1!=null&&temp2!=null){
    sum=c+temp1.data+temp2.data;
    digit=sum%10;
    c=sum/10;
    create(head3, digit);
    temp1=temp1.next;
    temp2=temp2.next;
  }
  while(temp1!=null){
    sum=c+temp1.data;
    digit=sum%10;
    create(head3, digit);
    c=sum/10;
    temp1=temp1.next;
  }
   while(temp2!=null){
    sum=c+temp2.data;
    digit=sum%10;
    create(head3, digit);
    c=sum/10;
    temp2=temp2.next;
  }
  while(c!=0){
    digit=c%10;
    create(head3, digit);
    c=c/10;
  }
   
   
return head3;
}
Node create(Node head,int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
    }
    else{
       Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    return head;
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