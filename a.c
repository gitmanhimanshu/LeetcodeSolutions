#include<stdio.h>
int power(int ,int );
void main(){
    int n,a,dig,sum=0;
    printf("enter numbr");
    scanf("%d",&n);
   int b=a=n;
    int c=0;
    while (/* condition */n!=0)
    {
        /* code */c++;
        n=n/10;
    }
    
    while ((a!=0))
    {
        dig=a%10;
        sum=sum+power(dig,c);
        printf("%d ",sum);
        a=a/10;
    }
    if(b==sum){
        printf("yes");
    }
    else{
        printf("no");
    }
    

}
int power(int n,int a){
    int f=1;
    while(a!=0){
f=f*n;
a--;
    }
    return f;
}