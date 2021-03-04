import java.util.Scanner;
class star26
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
System.out.print(" ");
int k=1;
for(int j=1;j<=2*i-1;j++){
	System.out.print((char)(k+64));
if(j<i)
k++;
else
k--;
}

System.out.println();
}
}
}
C:\Users\hp\java>java star26
7
      A
     ABA
    ABCBA
   ABCDCBA
  ABCDEDCBA
 ABCDEFEDCBA
ABCDEFGFEDCBA
