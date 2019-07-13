#include<stdio.h>
int main()
{
  //Type your code here
  int a,rem,i=1;
  long int sum=0;
  scanf("%d",&a);
  while(a!=0)
  {
    rem=a%2;
    a=a/2;
    sum=sum+(rem*i);
    i=i*10;
  }
  printf("%d",sum);
  return 0;
}