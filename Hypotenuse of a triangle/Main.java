#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b;
  scanf("%f%f",&a,&b);
  float e=a*a;
  float r=b*b;
  float u=e+r;
  float c=sqrtf(u);
  printf("%.2f",c);
  return 0;
}