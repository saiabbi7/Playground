#include<stdio.h>
#include<string.h>
int main()
{
  char str[100],t[100];
  scanf("%[^\n]s", str);
  int n=strlen(str);
  int j=0,i;
  
  //Type your code here
  for(i=0;str[i] !='\0';i++)
  {
    if(!(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O'|| str[i] == 'U'))
    {
     
        t[j]=str[i];
      j++;
      }
  }
      t[j]='\0';
  strcpy(str, t);
  printf("%s\n",str);
      
   
  
  return 0;
}