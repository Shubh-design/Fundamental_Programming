//define a method to return n^p
import java.util.Scanner;
class power_rec{
static int pow(int n,int p)
{
int pw=1;
if(p<0)
return pw;
else 
return pow(n,p-1)*n;
}
public static void main(String[] args)
{
int n=5,p=4;
System.out.println(pow(n,p));
}
}