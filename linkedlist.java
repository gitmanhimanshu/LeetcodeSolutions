import java.util.Scanner;

import org.w3c.dom.Node;

public class linkedlist {
    class Node {
        int data;
        Node next;
        Node (int value){
            data=value;
            this.next=null;
        }
    }
    Node head=null;
    void InsertAtFirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }


    }
    void InsertAtLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }temp.next=newnode;
        }

    }
    void show(){
        if(head==null){
            System.out.println("no data");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            
            }
        }

    }
    void ispost(Node temp,int p,int data,int pos){
        if(p==pos-1){
            Node nnode=new Node(data);
            nnode.next=temp.next;
            temp.next=nnode;
            return; 
        }
        ispost(temp.next, p+1, data, pos);

    }
        void deleteDuplicates(Node head){
        Node temp=head;
        while(temp.next!=null){
        if(temp.data==temp.next.data){
            temp.next=temp.next.next;
        }
        else{
            temp=temp.next;
        }

       }
    }
    public static void main(String[] args) {
        linkedlist l=new linkedlist();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1=isert fisrst 2=last 3=show 4=exit 5=position");
            int n=sc.nextInt();
            switch(n){
                case 1:System.out.println("enter the data");
                int data=sc.nextInt();
                l.InsertAtFirst(data);
                break;
                
                case 2:System.out.println("enter the data");
                int data2=sc.nextInt();
                l.InsertAtLast(data2);
                break;
                case 3: l.show();
                break;
                case 4: return; 
                case 5:
                System.out.println("enter the data");
                    int data3=sc.nextInt();
                    System.out.println("enter the position");
                    int pos=sc.nextInt();
                    l.ispost(l.head,1,data3,pos);
            }

        }
        l.deleteDuplicates(l.head);
        l.show();
    }
}
