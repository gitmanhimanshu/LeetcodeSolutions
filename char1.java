import java.util.Scanner;

public class char1 {
    public static void main(String[] args) {
       
        String a="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
       String s=sc.nextLine();
     System.out.println(s);
    int st=0;
    int e=s.length();
  for(int i=s.length()-1;i>=0;i--){
    a=a+s.charAt(i);
  }
  System.out.println(a);
  if(s.equals(a)){
    System.out.println("it is palindrome");
  }
  else{
    System.out.println("it is not palinedrome");
  }
    }
}
