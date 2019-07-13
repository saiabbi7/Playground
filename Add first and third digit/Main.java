#include<stdio.h>
int main()
{
  //Type your code here
  int n,f,l,sum;
  scanf("%d",&n);
  f=n/100;
  l=n%10;
  sum=f+l;
  printf("%d",sum);
  return 0;
}