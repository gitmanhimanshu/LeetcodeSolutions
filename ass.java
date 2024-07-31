import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        System.out.println("enter the array ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
            List<List<Integer>> himansh = new ArrayList<>();
        Arrays.sort(a);
        for (int i = 0; i < n-2; i++) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = a[i] + a[j] + a[k];
                if (sum == 0) {   
                    himansh.add(Arrays.asList(a[i], a[j], a[k]));
                    while (j < k && a[j] ==a[j + 1]) {
                        j++;
                    }
                    while (j < k && a[k] == a[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (sum < 0) {
              
                    j++;
                } else {
                   
                    k--;
                }
            }
        }
        System.out.println(himansh);
    }
}
    
    

