import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class binarytree{
    public static void main(String[] args) {
       node root=null;
       root=buildtree(root);
       leve(root);
    //    preorder(root);
    }
    static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void leve(node root){
        Queue<node> him=new LinkedList<>();
        him.add(root);
        him.add(null);
        while(!him.isEmpty()){
            node temp=him.peek();
            him.remove();
            if(temp==null){
                System.out.println();
                if(!him.isEmpty()){
                    him.add(null);
                }
            }
          
            else{
                  System.out.print(temp.data+" ");
            if(temp.left!=null){
                him.add(temp.left);
            }
            if(temp.right!=null){
                him.add(temp.right);
            }
        }
        }
    }
    
    static node buildtree(node root){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the data");
        int data=sc.nextInt();
        root=new node(data);
        if(data==-1){
            return null;
        }
        System.out.println("enter the left child of "+data);
        root.left=buildtree(root);
        System.out.println("enter the right child of "+data);
        root.right=buildtree(root);
        return root;

    }
}   
class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}