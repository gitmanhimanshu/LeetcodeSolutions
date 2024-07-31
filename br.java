import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class br {
    public static void main(String[] args) throws IOException {
        FileReader f1=new FileReader("ankit.txt");
        BufferedReader fr=new BufferedReader(f1);
        String l=fr.readLine();
        while(l!=null){
            System.out.println(l);
            l=fr.readLine();
        }
        fr.close();
    }
    
}
