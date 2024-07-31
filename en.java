import java.util.Scanner;

public class en {
    private int  AccountNo;
    private int Balance;
 int getAccountNo(String pass){
    if(pass=="himanshu"){
        return AccountNo;
    }
    else{
        System.out.println("wrong password");
    }
    void setAccountNo(int n,String pass){
        if(pass=="himanshu"){
            AccountNo=n;
        }
        else{
            System.out.println("wrong password");
        }
        int setBalance(String pass){
    if(pass=="himanshu"){
        return Balance;
    }
    else{
        System.out.println("wrong password");
    }
    void setBalance(int n,String pass){
        if(pass=="himanshu"){
            Balance=n;
        }
        else{
            System.out.println("wrong password");
        }

    }
 }
    
}
class test{
    public static void main(String[] args) {
        en a =new en();
        Scanner sc=new Scanner(System.in);
        
    }
}
