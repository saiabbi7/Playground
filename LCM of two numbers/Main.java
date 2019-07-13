#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,gcd;
  scanf("%d%d",&a,&b);
  int small=a>b?b:a;
  for(int i=small;i>=-1;i--)
  {
    if((a%i) == 0 && (b%i) == 0)
    {
      gcd=i;
      break;
    }
  }
  int lcm=(a*b)/gcd;
  printf("%d",lcm);
  
  return 0;
}