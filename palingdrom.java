import java.util.Scanner;
class palingdrom{
public static void main(String[] args)
{
boolean rs=true;
Scanner in=new Scanner(System.in);
String s=in.nextLine();
char c[]=s.toCharArray();
for(int i=0;i<c.length/2;i++)
{
for(int j=c.length;j>c.length;j--){
if(c[i]!=c[j])
{
rs=false;
break;
}
}
}
if(rs==true)
System.out.println("palingdrom");
else
System.out.println("not a palingdrom");
}
}