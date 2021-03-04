import java.util.Scanner;
class star10{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int k=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++,k++)
{
System.out.print(k%2+" ");
}
System.out.println();
}
}
}
/*C:\Users\hp\java>java star10
5
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
*/