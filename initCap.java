//Wajp to convert every word first character into capital remaining all to small.
class initCap{
static void initCap(String s)
{
char ch[]=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
	{
	if(ch[i]>='a' && ch[i]<='z')
		ch[i]=(char)(ch[i]-32);
	}
	else
	{
	if (ch[i]>='A' && ch[i]<='Z')
	ch[i]=(char)(ch[i]+32);
	}
}
for(int i=0;i<ch.length;i++)
System.out.print(ch[i]);
}
public static void main(String[] args)
{
int i,j;
String s="lisTen thE mUsic";
initCap(s);

}
}