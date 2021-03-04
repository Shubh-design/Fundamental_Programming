//Wajp to calculate the sum of squares of its digits
import java.util.Scanner;
class sum_of_squares_of_digits{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int r,sum=0;
while(n!=0)
{
r=n%10;
sum+=r*r;
n/=10;
}
System.out.println("Sum of its digits"+sum);
}
}
