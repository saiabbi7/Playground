#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  int f=0,s=1,t;
  printf("0 1");
  for(int i=2;i<a;i++)
  {
    t=f+s;
    printf(" %d",t);
    f=s;
    s=t;
  }
  return 0;
}