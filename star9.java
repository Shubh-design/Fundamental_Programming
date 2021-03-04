import java.util.Scanner;
class star9{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++){
if(i==j || i+j==n+1 || j%2==1)
	System.out.print(j%2);
}
System.out.println();
}
}
}