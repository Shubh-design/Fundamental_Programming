import java.util.Scanner;
class star13{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int k=1;
for(int i=1;i<=n;i++)
{
for(int j=i;j>=1;j--)
{
System.out.print(j);
}
System.out.println();
}
}
}
/*
C:\Users\hp\java>javac star13.java

C:\Users\hp\java>java star13
7
1
21
321
4321
54321
654321
7654321
*/