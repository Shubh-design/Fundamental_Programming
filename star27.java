import java.util.Scanner;
class star27
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int sp=n/2,star=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=sp;j++)
System.out.print("  ");

for(int j=1;j<=star;j++)
	System.out.print("* ");

if(i<=n/2){
	sp--;
	star=star+2;
}
else 
{
	sp++;
	star=star-2;
}

System.out.println();
}
}
}
/*C:\Users\hp\java>java star27
7
      *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *
*/
