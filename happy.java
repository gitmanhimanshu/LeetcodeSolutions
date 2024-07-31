public class happy {
    public static void main(String[] args) {
        
        int n=2;
      int first=n;
      int second =n;
      do{
        first=sum(first);
        second=sum(sum(second));
      }while(first!=second);
      if(first==1){
        System.out.println("it is happy");
      }
      else{
        System.out.println("it is not happy");
      }
    }
    static int sum(int n){
        int sum1=0;
    while(n!=0){
        int d=n%10;
        sum1=sum1+(d*d);
        n=n/10;
    }
    return sum1;
    } 
    
}
