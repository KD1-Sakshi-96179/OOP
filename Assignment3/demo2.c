#include<stdio.h>

int main()
{
    int n,i,c;
    printf("enter a number:");
    scanf("%d",&n);
    int a=0;
    int b=1;
    printf("%d \t%d\t",a,b);
    for(int i=1;i<=n;i++){
    c=a+b;
    a=b;
    b=c;
    printf("%d\t",c);

    }
    return 0;
    



}