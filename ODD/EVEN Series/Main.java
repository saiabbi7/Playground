#include<stdio.h>
int main()
{
	//type your code here
  int n,a=0,d1=2,d2=1;
  scanf("%d",&n);
  if(n%2==1)
  {
    int t1=(n+1)/2;
    int z=a+(t1-1)*d1;
    printf("%d",z);
  }
  else
  {
    int t2=n/2;
    int w=a+(t2-1)*d2;
    printf("%d",w);
  }
  return 0;
	
}