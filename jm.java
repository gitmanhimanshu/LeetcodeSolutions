public class jm {
    public static void main(String[] args) {
        pat("", "abc");
    }
    static void pat(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
    char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i, p.length());
            pat(s+ch+f, up.substring(1));
        }

    }
    
}
