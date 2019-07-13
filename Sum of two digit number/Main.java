#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int temp=n%10;
  int a=n/10;
  int sum=a+temp;
  printf("%d",sum);
  
  return 0;
}