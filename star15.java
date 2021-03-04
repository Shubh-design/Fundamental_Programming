import java.util.Scanner;
class star15{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int k=1;
for(int i=1;i<=n;i++)
{
for(int j=n;j>=i;j--)
{
System.out.print("* ");
}
System.out.println();
}
}
}
/*
C:\Users\hp\java>javac star15.java

C:\Users\hp\java>java star15
5
* * * * *
* * * *
* * *
* *
*
*/