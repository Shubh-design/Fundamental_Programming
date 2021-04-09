import java.util.Scanner;
class cipher{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);

String s=in.nextLine();
char ch[]=s.toCharArray();
int k=in.nextInt();
k=k%26;
for(int i=0;i<ch.length;i++)
{
if(ch[i]-k<65)
ch[i]=(char)(ch[i]-k+26);
else
ch[i]=(char)(ch[i]-k);
}
 s=new String(ch);
System.out.println(s);
}
}