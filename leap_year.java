import java.util.Scanner;
class leap_year{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int yy=in.nextInt();
if(yy%400==0)
System.out.println("leap year");
else if(yy%4==0)
if(yy%100==0)
System.out.println("not a leap year");
else
System.out.println(" leap year");
else
System.out.println("not a leap year");
}
}