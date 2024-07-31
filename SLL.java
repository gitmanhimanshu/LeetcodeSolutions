import java.util.HashMap;
import java.util.Map;

public class SLL {
    Node head = null;

    class Node {
        int data;
        Node next;


        Node(int data) {
            this.data = data;
            this.next = null;
           
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void sum(int k) {

    }
    // void insertAtBeg(int data) {

    // Node n = new Node(data);
    // if(head==null){
    // head=n;
    // return;
    // }
    // n.next = head;
    // head = n;

    // }

    void insertAtLast(int data,int i,  Map<Integer,Integer> h) {
        if (head == null) {
            head = new Node(data);
         h.put(i,data);

















         
            return;
        }
        Node temp = head;
        
        while (temp.next != null) {
          
            temp = temp.next;

        }
        if(i>1){
            h.put(i, h.get(i-1)+data);
        }
        temp.next = new Node(data);
       
    }

    // int find(int k) {
    //     int prev = 1;
    //     Node temp = head;
    //     while (prev < k&&temp!=null) {
    //         temp = temp.next;
    //         prev++;
    //     }
        
    //     return temp.sum;

    // }
    // void insertAtGiven(int data, int pos) {
    // int k = 1;
    // Node prev = null;
    // Node curr = head;
    // while (k < pos) {
    // prev = curr;
    // curr = curr.next;
    // k++;
    // }
    // Node n = new Node(data);
    // n.next = prev.next;
    // prev.next = n;
    // }

    public static void main(String[] args) {
        SLL list = new SLL();
        int i=1;
        Map<Integer,Integer> h=new HashMap<>();
        list.insertAtLast(20,i++,h);
        list.insertAtLast(30,i++,h);
        list.insertAtLast(40,i++,h);
        list.insertAtLast(50,i++,h);
        list.insertAtLast(60,i++,h);
        list.display();
        System.out.println();
      System.out.println(h.get(4));

    }
}