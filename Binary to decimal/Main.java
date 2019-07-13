#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  int rem,sum=0,i=0;
  while(a!=0)
  {
    rem=a%10;
    a=a/10;
    sum=sum+rem*pow(2,i);
    i++;
  }
  printf("%d",sum);
  return 0;
}