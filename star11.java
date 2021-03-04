import java.util.Scanner;
class star11{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int k=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++,k++)
{
if(i==j||i+j==n+1||j==n/2+1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
/*C:\Users\hp\java>javac star11.java

C:\Users\hp\java>java star11
7
*  *  *
 * * *
  ***
   *
  ***
 * * *
*  *  *
*/