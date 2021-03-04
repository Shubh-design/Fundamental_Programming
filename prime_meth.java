//Define a method to return true if the no. is prime otherwise return false
import java.util.Scanner;
class prime_meth{
static boolean prime(int n){
for(int i=2;i<n/2;i++)
if(n%i==0)
return false;
return true;
}
public static void main(String[] args)
{
int n;
Scanner in=new Scanner(System.in);
n=in.nextInt();
if(prime(n))
System.out.println("prime no."+n);
else
System.out.println("not a prime no."+n);
}
}