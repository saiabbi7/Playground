#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int num=1;
  while(num <= n)
  {
    if(n%num==0)
    {
      printf("%d\n",num);
    }
    num=num+1;
  }
	return 0;
}