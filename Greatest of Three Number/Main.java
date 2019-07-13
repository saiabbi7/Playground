#include <stdio.h>

int main()
{ 
    // type your code here
  int a[20];
  for(int i=0;i<3;i++){
  scanf("%d,",&a[i]);
  }
  int i=0;
  if(a[i]>a[i+1] && a[i]>a[i+2])
  {
    printf("%d",a[i]);
  }
  else if(a[i+1]>a[i] && a[i+1]>a[i+2])
  {
    printf("%d",a[i+1]);
  }
  else
  {
    printf("%d",a[i+2]);
  }
  return 0;
}