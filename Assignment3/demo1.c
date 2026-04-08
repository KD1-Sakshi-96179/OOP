#include<stdio.h>

void main()
{
    int num, i;
   int  factorial=1;

    printf("enter a number:");
    scanf("%d",&num);

    for(i=1;i<=num;i++){
        factorial= factorial *i;
    }
    printf("factorial of %d is %d",num,factorial);
    
}
