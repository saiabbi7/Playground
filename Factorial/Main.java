#include<stdio.h>
int main()
{
	//your code here
  long int a,sum=1;
  scanf("%ld",&a);;
  while(a!=0)
  {
    sum=sum*a;
      a--;
  }
  printf("%ld",sum);

}