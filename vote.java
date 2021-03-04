//WAJP
import java.util.Scanner;
class vote{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("What is yr name");
String s=in.nextLine();
System.out.println(s+"how old are u");
int n=in.nextInt();
if(n>=18)
System.out.println(s+" eligible for vote");
else 
System.out.println(s+" u r not eligible for vote");
}
}