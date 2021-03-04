import java.util.Scanner;
class star18{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
for(int i=n;i>0;i--)
{
for(int j=n;j>=i;j--)
{
System.out.print(i%2+" ");
}
System.out.println();
}
}
}
/*

C:\Users\hp\java>javac star18.java

C:\Users\hp\java>java star18
5
1
0 0
1 1 1
0 0 0 0
1 1 1 1 1
*/