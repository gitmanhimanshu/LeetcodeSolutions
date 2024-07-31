import java.util.Scanner;

public class merge1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("enter the array elements");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    mergesort(a, 0, n - 1);
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
  }

  static void mergesort(int a[], int lb, int ub) {
    if (lb >=ub){
      return;
    }
    int mid = (lb + ub) / 2;
    mergesort(a, lb, mid);
    mergesort(a, mid + 1, ub);
    merge(a, lb, ub);
  }

  static void merge(int a[], int lb, int ub) {
    int mid = (lb + ub) / 2;
    int l1 = mid - lb + 1;
    int l2 = ub - mid;
    int a1[] = new int[l1];
    int a2[] = new int[l2];
    int k=lb;
    for (int i = 0; i < l1; i++) {
      a1[i] = a[k++];
    }
    k=mid+1;
    for (int i = 0; i < l2; i++) {
      a2[i] = a[k++];
    }
    int i = 0, j = 0;
     k = lb;
    while (i < l1 || j < l2) {
      if (a1[i] < a2[j]) {
        a[k++] = a1[i++];
      } else {
        a[k++] = a2[j++];
      }
      if (i < l1 && j >= l2) {
        while (i < l1) {
          a[k++] = a1[i++];
        }
      }
      if (j < l2 && i >= l1) {
        while (j < l2) {
          a[k++] = a1[j++];
        }
      }
    }

  }

}
