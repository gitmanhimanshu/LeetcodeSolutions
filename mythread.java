 class test extends Thread{
    public void run(){
        System.out.println("child thread");
    }
    
}
class mythread{
    public static void main(String[] args) {
        test t=new test();
        t.start();
        System.out.println(" main thread");
    }
}
