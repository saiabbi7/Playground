#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int dec=0,oct=0,i=0;
  while(n != 0)
  {
    dec+=(n%10)*pow(2,i);
    n=n/10;
    i++;
  }
  i=1;
  while(dec != 0)
  {
    oct+=(dec%8)*i;
    dec=dec/8;
    i=i*10;
  }
  printf("%d",oct);
}