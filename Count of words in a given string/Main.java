#include<stdio.h>
#include<string.h>

int main()
{
  //Type your code here
  char a[50];
  int count=1;
  gets(a);
  int b=strlen(a);
  for(int i=1;a[i] !='\0';i++)
  {
    if(a[i] == ' ')
      count++;
  }
  printf("%d",count);
      
  
}