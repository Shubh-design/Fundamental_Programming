//Wajp to calculate the sum of digits in a string
import java.util.Scanner;

class sum_digits{
public static void main(String[] args)
{
int i,j,sum=0;
Scanner in=new Scanner(System.in);
String s=in.nextLine();
for(i=0;i<s.length();i++)
	if(s.charAt(i)>='0' && s.charAt(i)<='9')
		sum=sum+(int)s.charAt(i)-48;//Ascii value 0-48,1-49,2-50.....
System.out.println("sum:"+sum);
}
}
/*
C:\Users\hp\string>java sum_digits
shubham1234
sum:10
*/