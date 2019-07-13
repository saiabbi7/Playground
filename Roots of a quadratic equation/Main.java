#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c,r1,r2;
  scanf("%f%f%f",&a,&b,&c);
  float dis=(b*b)-(4*a*c);
  if(dis>0)
  {
    r1=(-b+sqrt(dis))/(2*a);
    r2=(-b-sqrt(dis))/(2*a);
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
    }
     else if(dis == 0)
           {
             r1=r2=(-b)/(2*a);
             printf("root1 = %.2f  root2 = %.2f",r1,r2);
           }
           else
           {
             float w=(-b)/(2*a);
             float t=sqrt(-dis)/(2*a);
               printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",w,t,w,t);
           }
           return 0;
           
}