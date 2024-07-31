#include<stdio.h>
#include<math.h>

void main(){
    int a,b,c; 
    printf("enter the value of a and b and c\n");
    scanf("%d%d%d",&a,&b,&c);
    int r=sqrt(b*b-(4*a*c))/2*a;
    int r2=(-b/2*a)+r;
    int r1=(-b/2*a)-r;
    printf("%d \n",r);
    printf("%d and %d ",r1,r2);
}