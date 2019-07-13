#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int rem,sum=0;
  int temp=n;
  while(n != 0)
  {
    rem=n%10;
    sum=sum+(rem*rem*rem);
    n=n/10;
  }
  if(temp == sum)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
    
	return 0;
}