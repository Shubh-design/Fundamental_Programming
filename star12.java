import java.util.Scanner;
class star12{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int k=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++,k++)
{
System.out.print(j);
}
System.out.println();
}
}
}
/*
C:\Users\hp\java>javac star12.java

C:\Users\hp\java>java star12
7
1
12
123
1234
12345
123456
1234567
*/