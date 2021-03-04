import java.util.Scanner;
class star19{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
for(int i=n;i>0;i--)
{
for(int j=n;j>=i;j--)
{
System.out.print(j%2+" ");
}
System.out.println();
}
}
}