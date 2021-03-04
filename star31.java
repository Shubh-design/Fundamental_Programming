import java.util.Scanner;
class star31{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int i,j,k=1,star=1,sp=n/2;
for(i=1;i<=n;i++)
{
for(j=1;j<=sp;j++)
System.out.print("  ");

for(j=1,k=1;j<=star;j++)
{
if(j<=star/2){
System.out.print(k+" ");
k++;
}
else
{
System.out.print(k+" ");
k--;
}
}
if(i<=n/2)
{
sp--;
star=star+2;
}
else
{
sp++;
star=star-2;
}
System.out.println();
}
}
}
/*
C:\Users\hp\java>java star31
7
      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1
  1 2 3 2 1
    1 2 1
      1

*/