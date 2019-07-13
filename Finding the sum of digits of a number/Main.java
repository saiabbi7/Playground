#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int x,sum=0;
  while(n!=0)
  {
    x=n%10;
    sum=sum+x;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}