#include<stdio.h>
int main()
{
  //Type your code here
  int n,b[50],a,count=0,j;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    scanf("%d",&b[i]);
  }
  scanf("%d",&a);
  for(int i=1;i<=n;i++)
  {
    if(b[i]==a)
    {
      count=1;
      j=i;
    }
  }
  if(count == 1)
  {
    printf("%d",j);
           }
  else
  {
    printf("%d isn't present in the array.",a);
  }
  return 0;
}