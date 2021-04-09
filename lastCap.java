//Wajp to convert every word last character into capital remaining all to small.
class lastCap{
static void LastCap(String s)
{
int k;
char ch[]=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(ch[i]>='A' && ch[i]<='Z')
ch[i]=(char)(ch[i]+32);

if(ch[i]==' ')
ch[i-1]=(char)(ch[i-1]-32);

if(ch.length-1==i)
ch[i]=(char)(ch[i]-32);
}
for(int i=0;i<ch.length;i++)
System.out.print(ch[i]);
}
public static void main(String[] args)
{
int i,j;
String s="LISten THe MUSic";
LastCap(s);
}
}
/*C:\Users\hp\string>java lastCap
listeN thE musiC
*/