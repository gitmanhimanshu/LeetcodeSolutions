import java.util.Scanner;

public class starray {
    int stck[]=new int[50];
    int top=-1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=1;
        starray b=new starray();
        while(c==1){
            System.out.println("enter the data");
            int data=sc.nextInt();
            b.push(data);
            System.out.println("1=more 2=no");
            c=sc.nextInt();
        }
        b.show();
       int number=(b.count());
    //    System.out.println("entet the data to be push at mid");
    //    int key=sc.nextInt();
    //    b.pushAtbottom(key);
       System.out.println();
    //    b.show();
    //    int i=1;
    //    while(i<=number){
    //     int d=b.stck[b.top];
    //     b.pop();
    //     b.pushAtbottom(d);
    // i++;  
    // }
    b.sort();
    b.show();

    }
    void sort(){
        if(!isEmpty()){
            int n=stck[top];
            pop();
            sort();
            pushsort(n);
        }
        else{
            return;
        }
    }
    void pushsort(int data){
        if(!isEmpty()&&stck[top]>data){
            int n=stck[top];
            pop();
            pushsort(data);
            push(n);
        }
        else{
            push(data);
            return;
        }
    }
    void reverse(){
        if(isEmpty()){
            return;
        }
        int n=stck[top];
        pop();
        reverse();
        pushAtbottom(n);
    }
    void pushAtbottom(int data){
        if(!isEmpty()){
            int num=stck[top];
            pop();
            pushAtbottom(data);
            push(num);
            
        }
        else{
            push(data);
        }
    }
    void pushAtMid(int data, int n, int count) {
        // Check if the stack is not empty and count is within bounds
        if (!isEmpty() && count < n/2) {
            int num = stck[top];
            pop();
            pushAtMid(data, n, count + 1);
            push(num);
        } else {
            // Reached the middle position, push the new data
            push(data);
        }
    }
    boolean isEmpty(){
        if(top==-1){
            return true; }
            else{
                return false;
                   }      
    }
    int count(){
        int c=0;
        if(top==-1){
            return 0;
        }else{
            int i=top;
            while(i>=0){
                c++;
                i--;
            }
        }
        return c;
    }
    void push(int data){
        if(top==49){
            System.out.println("stack overflow");
        }
        else{
            top++;
            stck[top]=data;
        }
    }
    void pop(){
          if(top==-1){
            System.out.println("no data");
        }
        else{
            stck[top]=0;
            top=top-1;
        }

    }
    void show(){
        if(top==-1){
            System.out.println("no data");
        }
        else{
            int i=top;
            while(i>=0){
                System.out.print (" "+ stck[i]);
                i--;
            }
        }
    }
}
