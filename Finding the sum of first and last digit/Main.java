#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int l=n%10;
  while(n >= 10)
  {
    n=n/10;
  }
  int sum=l+n;
  printf("%d",sum);
	return 0;
}