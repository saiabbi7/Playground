#include <stdio.h>
#include <math.h>
int main()
{
  	//Your code here   
  int a,b,c;
  scanf("%d%d",&a,&b);
  if(b<=-1)
  {
    printf("Wrong input");
  }
  else
  {
    c=pow(a,b);
       printf("%d",c); 

  }
 
    return 0;
}