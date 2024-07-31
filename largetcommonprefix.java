import java.util.Scanner;

public class largetcommonprefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String strs[]=new String[5];
        System.out.println("enter the string");
        for(int i=0;i<5;i++){
            strs[i]=sc.nextLine();
        }
       String ans="";
        String first=strs[0];
        for(int i=0;i<first.length();i++){
            char ch=first.charAt(i);
            boolean match=true;
            for(int j=1;j<strs.length;j++){
                String other=strs[j];
                if(ch!=other.charAt(i)){
                    match=false;
                    break;
                }
            }
            if(match==false){
                break;
            }
            else{
                ans=ans+ch;
            }
        }
        
    }
}
