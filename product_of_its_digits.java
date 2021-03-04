import java.util.Scanner;
class product_of_its_digits{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int r,pro=1;
while(n!=0)
{
r=n%10;
pro=pro*r;
n/=10;
}
System.out.println("Product of its digit"+pro);
}
}