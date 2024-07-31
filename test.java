public class test{
    public static void main(String[] args) {
        stu d=new stu(30,60,70,78);
        System.out.println(d.n,d.classs,d.vill);
    
}
    
}
class p{
    int name;
    int n;
    p(int n,int a){
        this.name=n;
        this.n=a;
    }

}
class stu extends p{
int classs;

int vill;


stu(int n,int nu,int c,int v){
    super(n, nu);
    this.classs=c;
    this.vill= v;
    

}
}