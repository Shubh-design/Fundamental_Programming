//Wajp to check user enter no. is prime or not
import java.util.Scanner;
class prime
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
String st=(n%2==0)?"even":"odd";
System.out.println(n+"is a"+st+"number");
boolean rs=true;
for(int i=2;i<=n/2;i++){
if(n%i==0)
{
rs=false;
break;
}
}
if(rs==true)
System.out.println("prime");
else 
System.out.println("not a prime");
}
}