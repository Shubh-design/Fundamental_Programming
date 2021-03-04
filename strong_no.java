//Define a method to check user entered no. is strong no. or not
import java.util.Scanner;
class Strong_no{
static int fact(int y){
int fact=1;
for(int i=y;i>=2;i--)
fact=fact*i;
return fact;
}
static boolean isstrong(int n)
{
int r,sum=0,t=n;
do
{
r=n%10;
sum=sum+fact(r);
n=n/10;
}while(n!=0);
return sum==t;
}
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("enter the no.");
int n=in.nextInt();
boolean rs=isstrong(n);
if(rs)
System.out.println("strong no.");
else
System.out.println("not a strong no.");
}
}