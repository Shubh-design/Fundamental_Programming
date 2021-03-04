import java.util.Scanner;
class star16{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
for(int i=n;i>0;i--)
{
for(int j=n;j>=i;j--)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}
/*
C:\Users\hp\java>java star16
5
5
4 4
3 3 3
2 2 2 2
1 1 1 1 1
*/