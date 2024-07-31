import java.util.Scanner;

public class linked {
    LL head=null;
    class LL{
        String data;
        LL next;
        LL(String data){
            this.data=data;
            this.next=null;
        }
    }
    void printl(){
        LL temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
void addfirst(String data){
    LL newnode =new LL(data);
    if(head==null){
        head=newnode;
    }
    else{
        newnode.next=head;
        head=newnode;
    }
}
    public static void main(String[] args) {
        int i=0;
        linked a=new linked();
        Scanner sc=new Scanner(System.in);
        while(i<=5){
        System.out.println("enter the data");
        String data=sc.nextLine();
        a.addfirst(data);
        i++;
        }
        a.printl();
    }
    
    
}
