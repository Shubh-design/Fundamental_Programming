import java.util.Scanner;
class Two_digit{
public static void main(String[] args)
{
int n;
Scanner in=new Scanner(System.in);
n=in.nextInt();
if(n<100 || n>9 || n<-9 || n>-100)
System.out.println("2 digit no.");
else
System.out.println("not a 2 digit no.");
}
}