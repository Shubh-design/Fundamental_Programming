//WAJP to calculate the sum of first n natural no.s
import java.util.Scanner;
class sum
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
sum+=i;
System.out.print(" "+sum);
}
}