#include<stdio.h>
#include<string.h>
int main()
{
	//type your code here
  char a[50];
  scanf("%s",a);
  int n=strlen(a);
  int count=1;
    if(n>20)
    {
      printf("Invalid Input");
    }
    else
    {
      for(int i=0;i<n;i++)
      {
    if(a[i]==a[i+1])
    {
      count++;
    }
    else
    {
    printf("%c%d",a[i],count);
    count=1;
    }
  }
    }
    
    return 0;
}