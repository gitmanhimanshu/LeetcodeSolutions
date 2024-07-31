import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class revli {
    Node head=null;
    public static void main(String[] args) {
        int c=1;
        Scanner sc=new Scanner(System.in);
       
        revli b=new revli();
        while(c==1){
             System.out.print("enter the data");
           int data=sc.nextInt();
            b.addfirst(data);
            System.out.println("1=more\n2=no");
            c=sc.nextInt();
        }
        b.print();
    //     System.out.println("enter the position ");
    //     int k=sc.nextInt();
    //   b.head=b.revpos(b.head,k);
    //   System.out.println();
    //   b.print();
System.out.println(b.detect(b.head));
       
       
        
    }
    Node revpos(Node head,int k){
        if(head==null){
            return head;
        }
        Node prev=null;
        Node curr=head;
        Node next=null;
        int c=0;
        while(curr!=null&&c<k){
             next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            c++;

        }
        if(next!=null){
            head.next=revpos(next,k);
        }
        return prev;
    }
    Node revrec(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newhead=revrec(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
        
    }
    int middle(){
        Node s=head;
            Node e=head.next;
        if(head==null){
            return 0;
        }
        if(head.next==null){
       
        return head.data;
        }
        if(head.next.next==null){
            head=head.next;
            return head.data;
        }
        else{
            
            while(e!=null){
                e=e.next;
                if(e!=null){
                    e=e.next;
                }
                s=s.next;
            }
        }
        return s.data;
    }
    // int  middle(int count){
    //     int c=count/2;
    //     int a=0;
    //     Node temp=head;
    //     while(a<c){
    //         temp=temp.next;
    //         a++;

    //     }
    //     return temp.data;
    // }
    int count(){
        int count=0;
        if(head==null){
            return 0;
        }
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    void addfirst(int data){
        Node newnode=new Node(data);
    
    if(head==null){
        head=newnode;
    }else{
        newnode.next=head;
        head=newnode;
    }
}
boolean detect(Node head){
    Map<Node,Boolean>visited=new HashMap<>();
    if(head==null){
        return true;
    }
    Node temp=head;
    visited.put(temp, true);
    temp=temp.next;
    while(temp!=null){
        if(visited.get(temp)&&visited.containsKey(temp)){
            return true;
        }
        visited.put(temp,true);
        temp=temp.next;
    }
    return false;

}

void print(){
    if(head==null){
        return;
    }
    else{
      Node  temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}}



class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}