//WAJP to print numbers from n to 1
import java.util.Scanner;
class number{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n>0)
{
System.out.print(" "+n);
n--;
}
}
}