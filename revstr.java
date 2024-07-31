import java.util.Scanner;

class revstr{
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the String ");
      String s=sc.nextLine();
      print(s, 0);

    }
    static void print(String s,int i){
        if(i==s.length()){
            return;
        }
                print(s, i+1);
        System.out.print(s.charAt(i)+" ");

    }
}