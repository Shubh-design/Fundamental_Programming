import java.util.Scanner;
class star8{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
char c='A';
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++){
	System.out.print((char)(c+i-1));
}
System.out.println();
}
}
}