#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int a,b;
  scanf("%d%d",&a,&b);
  int small=a>b?b:a;
  for(int i=small;i>=-1;i--)
  {
    if((a%i) == 0 && (b%i) == 0)
    {
      printf("%d",i);
      break;
    }
  }
  
   return 0;
}