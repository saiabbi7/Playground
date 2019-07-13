#include<stdio.h>
int main()
{
  	//type your code here
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int larg=a[0];
  for(int i=0;i<n;i++)
  {
    if(larg<a[i])
    {
      larg=a[i];
    }
  }
  printf("%d",larg);
  return 0;
}