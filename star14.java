import java.util.Scanner;
class star14{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int k=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print((char)(j+64)+" ");
}
System.out.println();
}
}
}
/*
C:\Users\hp\java>javac star14.java

C:\Users\hp\java>java star14
7
A
A B
A B C
A B C D
A B C D E
A B C D E F
A B C D E F G
*/