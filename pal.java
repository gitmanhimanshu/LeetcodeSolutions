import java.util.ArrayList;
import java.util.Scanner;

public class pal {
    Node1 head1 = null;

    Node1 create(Node1 head, int data) {

        Node1 newNode = new Node1(data);
        Node1 temp = null;
        if (head == null) {
            head = temp = newNode;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

  void ispalindrome(Node1 head) {
        ArrayList<Integer> him = new ArrayList<>();
        Node1 temp = head;
        while (temp != null) {
            him.add(temp.data);
            temp = temp.next;
        }int a=0;
        int s = 0, e = him.size() - 1;
        while (s < e) {
            if (him.get(s) != him.get(e)) {
             a=1;
             break;
            }
        }
        if(a==0)
        {
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }

    void print(Node1 head) {
        if (head == null) {
            return;
        } else {
            Node1 temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 1;
        pal b = new pal();
        while (c == 1) {
            System.out.println("enter the data");
            int data = sc.nextInt();
            b.head1 = b.create(b.head1, data);
            System.out.println("1=more\n 2= no");
            c = sc.nextInt();
        }
        b.print(b.head1);
       b.ispalindrome(b.head1);
    }
}

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
