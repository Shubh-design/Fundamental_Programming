import java.util.Scanner;
class star20{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int k;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
	System.out.print(" ");
for(int j=1;j<=i;j++)
	System.out.print("*");
System.out.println();
}
}
}
/*
C:\Users\hp\java>java star20
5
    *
   **
  ***
 ****
*****

*/