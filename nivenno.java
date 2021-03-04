import java.util.Scanner;
class nivenno{
static int checkniven(int n)
{
int sum=0,t=n;
do{
int r=n%10;
sum=sum+r;
n=n/10;
}while(n!=0);
if(t%sum==0)
return t/sum;
else
return 0;
}
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int i=checkniven(n);
System.out.println(i);
}
}