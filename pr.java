import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class pr {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter("a.txt");
        BufferedReader b=new BufferedReader(new FileReader("abcd.txt"));   
        String line1=b.readLine();
        BufferedReader c=new BufferedReader(new FileReader("ankit.txt"));
        String line2=c.readLine();
        while(line1!=null|| line2!=null)
    {
if(line1!=null){
    pw.println(line1);
    line1=b.readLine();
}
if(line2!=null){
    pw.println(line2);
    line2=c.readLine();
}
    }
      
        pw.flush();
    
        b.close();
        c.close();
    }
    
}
