#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int n;
  scanf("%d",&n);
  int r=0,a,b,s=0;
  for(int i=1;i<=n;i++)
  {
    if(i%2== 1)
    {
      a=pow(2,s);
      s++;
    }
    else
    {
      b=pow(3,r);
      r++;
    }
  }
     if(n%2 == 1)
     {
       printf("%d",a);
     }
  else
  {
    printf("%d",b);
  }
  
      
  return 0;
}