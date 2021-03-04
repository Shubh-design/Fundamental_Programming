//Wajp to calculate the sum of digits in the no.
import java.util.Scanner;
class sum_digits
{
public static void(String[] args)
{
int sum=0,r;
Scanner in=new Scanner(System.in);
int n=in.nextInt();
do{
r=n%10;
sum+=r;
n/=10;
}while(n!=0);
System.out,println(sum);
}
}