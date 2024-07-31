public class sup{
    public static void main(String[] args) {
        stud d=new stud("himanshu",30,40,50);
        System.out.println(d.name);
        System.out.println(d.date);
        System.out.println(d.mobile);
        System.out.println(d.sal);
    }

}
class p{
    String name;
    int date;
    p(String n,int d){
        this.name=n;
        this.date=d;
    }
}
class stud extends p{
    int mobile;
    int sal;
    stud(String n,int d,int mobile,int sal){
        super(n, d);
        this.mobile=mobile;
        this.sal=sal;

    }

}