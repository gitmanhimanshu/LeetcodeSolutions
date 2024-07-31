import java.util.Scanner;

class book {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the numbner of students");
        int m = sc.nextInt();
        cal c = new cal();
        System.out.println(c.bookcal(a, n, m));
    }
}

class cal {
    possible b = new possible();

int bookcal(int a[],int n,int m){
    int ans=-1;
    int s=0;
    int e=0;5
    int mid;
for(int i=0;i<n;i++){
    e+=a[i];
}
while(s<=e)

    {
        mid = (s + e) / 2;
        if (b.h1(a, n, m, mid)) {
            ans = mid;
            e = mid - 1;
        } else {
            s = mid + 1;
        }

    }
    return ans;

}
}

class possible {
    Boolean h1(int a[], int n, int m, int mid) {
      int sum = 0;
       int stu = 1;
        for (int i = 0; i < n; i++) {
           if((sum+a[i])<=mid){
            sum=sum+a[i];
           }
            
            else {
                sum = a[i];
                stu++;





                if (stu > m || sum > mid) {
                    return false;
                }
            }
        }
        return true;
    }
}