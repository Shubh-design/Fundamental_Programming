import java.util.Scanner;
class star25
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
	System.out.print(k);
if(j<i)
k++;
else
k--;
}

System.out.println();
}
}
}
/*
C:\Users\hp\java>java star25
7
      1
     1 2 1
    1 2 3 2 1
   1 2 3 4 3 2 1
  1 2 3 4 5 4 3 2 1
 1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
*/