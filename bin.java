import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class bin {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        System.out.println("enter the aray elements");
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        search h=new search();
        int p=h.max(a,n);
        System.out.println(" max element is ");
    
    }

}

class search {
    int bin_search(int a[], int n, int key) {
        int l = 0, u = n - 1;
        int mid;
        while (l <= u) {
            mid = (u + l) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                u = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return -1;
    }

    int left_search(int a[], int n, int key) {
        int l = 0, u = n - 1;
        int mid,pos=-1;
        while (l <= u) {
            mid = (u + l) / 2;
            if (a[mid] == key) {
                pos = mid;
                l = mid + 1;
            } else if (a[mid] > key) {
                u = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return pos;
    }
int right_search(int a[], int n, int key) {
        int l = 0, u = n - 1;
        int mid,pos=-1;
        while (l <= u) {
            mid = (u + l) / 2;
            if (a[mid] == key) {
                pos = mid;
                l = mid + 1;
            } else if (a[mid] > key) {
                u = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return pos;
    }
    int max(int a[],int n){
        int l=0,u=n-1;
        int mid;
        while(l<=u){
            mid=(l+u)/2;
            if(a[mid]<a[mid+1]){
                l=mid+1;
            }
            else
            {
                u=mid;
            }
        }
        return l;
    }
}