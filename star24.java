import java.util.Scanner;
class star24
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
System.out.print(" ");
int k=i;
for(int j=1;j<=2*i-1;j++){
	System.out.print(k);
if(j<i)
k--;
else 
k++;
}

System.out.println();
}
}
}
/*
C:\Users\hp\java>java star24
7
      1
     212
    32123
   4321234
  543212345
 65432123456
7654321234567
*/