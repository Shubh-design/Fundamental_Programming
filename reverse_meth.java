//define a method to reverse the no.
import java.util.Scanner;
static int rev(int n)
{
int rev=0;
do{
r=n%10;
rev=rev*10+r;
n/=10;
}while(n!=0);
return rev;
}
class reverse_meth{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
System.out.println("reverse is:"+rev(n));
}
}