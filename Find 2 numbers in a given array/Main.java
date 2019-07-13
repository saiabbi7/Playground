#include<stdio.h>
int main()
{
  	//type your code here
  int n,b=-1,c=-1,q,r;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&q,&r);
 for(int j=0;j<n;j++)
 {
   if(a[j] == q && b == -1)
   {
     b=j;
   }
   if(a[j] == r && c == -1)
   {
    c=j;
   }
 }
 printf("Element 1 index = %d \nElement 2 index = %d",b,c);
  return 0;
      
}