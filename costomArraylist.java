import java.util.Arrays;

public class costomArraylist {
    int data[];
    int size;
    int defize=10;
    costomArraylist(){
        data=new int[defize];
        size=0;
    }
        public void add(int val){
            if(isfull()){
                resize();

            }
            data[size++]=val;
        }
        boolean isfull(){
            return(size==data.length);
        }
        void resize(){
            int temp[]=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        public String toString(){
            return Arrays.toString(data);
        }
        
    public static void main(String[] args) {
        costomArraylist him=new costomArraylist();
        him.add(9);
        System.out.println(him);
    }
}

