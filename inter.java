public class inter {
    public static void main(String[] args) {
        mythread r=new mythread();
       // Thread t=new Thread(r);
        r.start();
        System.out.println(" main thread");
    }
    
}
class mythread implements Runnable{
public void run(){
    System.out.println(" child thread");
}
}
