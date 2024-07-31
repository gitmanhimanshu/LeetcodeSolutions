import java.io.ObjectOutputStream.PutField;
import java.net.SocketTimeoutException;
import java.util.Scanner;

class cal{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
 System.out.println("1=sum 2=divide 3=multi 4=subs 5=factorial 6=sumbission 7=power"); 
 cal o=new cal();
 int n=sc.nextInt();

    
 switch(n){
    case 1:
    System.out.println("enter two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
 
    int s=o.sum(a,b);
    System.out.println(s);
    break;
    case 2:
    System.out.println("enter two numbers");
    int c=sc.nextInt();
    int d=sc.nextInt();
 
   System.out.println(o.div(c,d));
   break;
   case 3:
   System.out.println("enter two numbers");
    int e=sc.nextInt();
    int f=sc.nextInt();
 
   System.out.println(o.mul(e,f));
   break;
   case 4:
   System.out.println("enter two numbers");
    int g=sc.nextInt();
    int h=sc.nextInt();
 
   System.out.println(o.subs(g,h));
   break;
   case 5:
   System.out.println("ente the number");
   int i=sc.nextInt();
   System.out.println(o.fac(i));
   break;
   case 6:
   System.out.println("enter the number");
   int su=sc.nextInt();
   System.out.println(o.sumb(su));
   break;
   case 7:
   System.out.println("enter the number and power"); 
   int p=sc.nextInt();
   int po=sc.nextInt();
   System.out.println(o.pow(p,po));

 }
  }
  public int subs(int a,int b){
    return a-b;
  }
  public int pow(int a,int n){
    int s=1;
    while(n>0){
        s=s*a;
        n--;
    }
    return s;
  }
  public int sumb(int a){
    int s=0;
    while(a>0){
        s=s+a;
        a--;
    }
    return s;
  }
  public int fac(int a){
    int f=1;
    while(a>0){
        f=f*a;
        a--;
    }
    return f;
  }
  public int sum(int a,int b){
    return a+b;
  }
  public int div(int a,int b){
    return a/b;
  }
  public int mul(int a,int b){
    return a*b;
  }
}