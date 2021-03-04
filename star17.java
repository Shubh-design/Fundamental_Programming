import java.util.Scanner;
class star17{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
for(int i=n;i>0;i--)
{
for(int j=n;j>=1;j--)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}

/*
C:\Users\hp\java>javac star17.java

C:\Users\hp\java>java star17
5
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/