import java.util.Scanner;
class star23
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int k=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
System.out.print(" ");

for(int j=1;j<=2*i-1;j++){
	System.out.print(k%2);
k++;
}

System.out.println();
}
}
}
/*
C:\Users\hp\java>java star23
5
    1
   010
  10101
 0101010
101010101
*/