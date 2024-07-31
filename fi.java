import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;

import javax.swing.SortOrder;

public class fi {
    public static void main(String[] args) throws IOException {
       File f1=new File("C:\\java");
       
       int c=0;
       String s[]=f1.list();
       for(String a:s){
        File f2=new File(f1, a);
        if(f2.isDirectory()){
        System.out.println(a);
        c++;}

       }
       System.out.println(c);
    }
    
}