import java.util.Scanner;

public class merger {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }        
    merger b=new merger();
    b.mergesort(a, 0, n-1);
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
    }
    void mergesort(int a[],int s,int e){
        if(s>=e){
            return;
        }
        int  mid=(s+e)/2;
        mergesort(a, s, mid);
        mergesort(a, mid+1, e);
        merge(a,s,mid,e);
    }
    void merge(int a[],int s,int mid,int e){
        int l1=mid-s+1;
        int l2=e-mid;
        int a1[]=new int[l1];
        int a2[]=new int[l2];
        int k=s;
        for(int i=0;i<l1;i++){
            a1[i]=a[k++];
        }
        for(int i=0;i<l2;i++){
            a2[i]=a[k++];
        }
        int i=0,j=0;
        k=s;
        while(i<l1&&j<l2){
            if(a1[i]>a2[j]){
                a[k++]=a1[i++];
            }
            else{
                a[k++]=a2[j++];
            }
            if(i<l1&&j>=l2){
                a[k++]=a1[i++];
            }
            if(j<l2&&i>=l1){
                a[k++]=a2[j++];
            }
        }
    }
    
}
