#include<stdio.h>
int main()
{
  //type your code here
  int a;
  scanf("%d",&a);
    int rem,sum=0,i=1;
  while(a!=0)
  {
    rem=a%8;
    a=a/8;
    sum=sum+rem*i;
    i=i*10;
  }
  printf("%d",sum);
  return 0;
}