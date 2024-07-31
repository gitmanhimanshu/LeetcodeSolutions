import java.util.ArrayList;
import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
       subseq("", "12345");
       System.out.println(him);
    }
  static  ArrayList<String> him=new ArrayList<>();
   static void subseq(String p,String up){
    if(up.isEmpty()){
       him.add(p);
        return;
    }
    char ch=up.charAt(0); 
    subseq(p+ch, up.substring(1));
    subseq(p, up.substring(1));
   }

}
