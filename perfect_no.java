import java.util.Scanner;
class perfect_no{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int sum=0,r;

int n=in.nextInt();
for(int i=1;i<=n/2;i++)
if(n%i==0)
sum=sum+i;

if(sum==n)
System.out.println("perfect no.");
else 
System.out.println("not perfect no.");

}
}