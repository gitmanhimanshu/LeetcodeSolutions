import java.util.Scanner;

class tree{
   static class Node {
        int data;
        Node left,right;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
  
   static Node create(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter the data");
            int data=sc.nextInt();
            if(data==-1){
                return null;
            }
            Node newnode=new Node(data);
            System.out.println("enter the left child  of "+data);
            newnode.left=create();
            System.out.println("enter the right child of "+data);
            newnode.right=create();
            return newnode;
        }

    }
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root;
        tree l=new tree();
        
     root=create();
     inorder(root);
        
    }
}
