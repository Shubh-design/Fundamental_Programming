//Wajp to convert all the characters in the given string to lowercase
import java.util.Scanner;
class lowercase{
static void lower(String s)
{
char ch[]=new char[s.length()];
for(int i=0;i<s.length();i++)
{
ch[i]=s.charAt(i);
if(ch[i]>='A' && ch[i]<='Z')
ch[i]=(char)(ch[i]+32);
}
//String s1=ch.toString();
for(int i=0;i<ch.length;i++)
System.out.print(ch[i]);
}
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String s=in.nextLine();
lower(s);
//System.out.println(s);
}
}
/*C:\Users\hp\string>java lowercase
RAJU IS A GOOD BOY
raju is a good boy
*/