import java.util.Scanner;
class star30{
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
if(j%2==0){
System.out.print("* ");

}
else
{
System.out.print(k+" ");
k++;
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
C:\Users\hp\java>java star30
7
      1
    1 * 2
  1 * 2 * 3
1 * 2 * 3 * 4
  1 * 2 * 3
    1 * 2
      1

C:\Users\hp\java>
*/