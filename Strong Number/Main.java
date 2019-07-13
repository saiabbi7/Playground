#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int rev=0,e=n;
  while(n)
  {
    int tem=n%10;
    int r=1,sum=1;
    while(r <= tem)
    {
      sum=sum*r;
      r=r+1;
    }
    rev=rev+sum;
    
    n=n/10;
  }
  if( rev == e)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
    
	return 0;
}