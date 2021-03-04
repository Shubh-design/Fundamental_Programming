import java.util.Scanner;
class star22
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
System.out.print(" ");

for(int j=1;j<=i;j++){
	System.out.print(j+" ");
	if(j<i)
	System.out.print("*");
}

System.out.println();
}
}
}
/*C:\Users\hp\java>java star22
7
      1
     1 *2
    1 *2 *3
   1 *2 *3 *4
  1 *2 *3 *4 *5
 1 *2 *3 *4 *5 *6
1 *2 *3 *4 *5 *6 *7
*/