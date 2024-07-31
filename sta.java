class sta{
    char st[]=new char[50];
    int top=-1;
    public static void main(String[] args) {
        sta b=new sta();
        String s="himanshu";
        for(int i=0;i<s.length();i++){
            b.push(s.charAt(i));
        }
        b.print();

    }
    void push(char data){
       if(top==50){
      System.out.println("full");
       }
       else{
        top++;
        st[top]=data;
       }
    }
    void pop(){
        if(top==-1){
            System.out.println("no elements");
        }
        else{
            int data=st[top];
            top--;
        }
    }
    void print(){
        if(top==-1){
            System.out.println("no elements");
        }
        else{
         int a=top;
         while(a>=0){
            System.out.println(st[a]+" ");
            a--;
         }
        }
    }
}