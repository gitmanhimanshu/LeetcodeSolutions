#include <conio.h>
#include <stdio.h>

void swap(int, int, int);
void MH_sort(int);
void MH(int , int, int);

int A[], n, l, lf, r, temp, i;

void swap(int a[], int i, int j) {

  int c = a[i];
  a[i] = a[j];
  a[j] = c;
}

void MH_sort(A[]) {
  l = n;
  for (i = l / 2; i < n; i++) {
    MH(A, i);
  }
  for (i = n; i >= 0; i--) {
    swap(A[i], A[0]);
    l = l - 1;
    MH(A, 1);
  }
}

void MH(int a[], int n,int l) {
        int left = 2 * l+1;
        int ri = 2 * l + 2;
        if (left <= n && a[left] > a[l]) {
            int largest = left;
            swap(a, left, l);
            maxheap(a,a.length-1, largest);
        }
        if (ri <= n && a[ri] > a[l]) {
            int largest = ri;
            swap(a, ri, l);

            maxheap(a,a.length-1, largest);

        }
    }


void main() {
  clrscr();
  printf("Enter the number of elements in array\n");
  scanf("%d", &n);
  printf("\n Enter %d numbers", n);
  for (i = 0; i < n; i++)
    scanf("%d", &A[i]);
  MH_sort(A);
  printf("\n Sorted Array is \n ");
  for (i = 0; i < n; i++) {
    printf("%d ", A[i]);
  }
}