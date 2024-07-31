public class hi {
    public static void main(String[] args) {
        int c=0;
        int a[]={2,4,3,5,1};
        for (int i = 0; i <a.length; i++) {
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j+1]){
                    c++;
                    System.out.println(a[i]+" "+a[j]);
                   

                }
            }
        }
        System.out.println(c);
    }
    
}
