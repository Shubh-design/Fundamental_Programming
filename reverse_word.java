//reverse the words in the sentence.
class reverse_word{
public static void main(String[] args)
{
String s="Shubham Jaiswal";
char ch[]=s.toCharArray();
int f=0;
for(int i=0;i<ch.length;i++)
{

if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
f=i;
if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ')
	{
	char t=ch[i];
	ch[i]=ch[f];
	ch[f]=t;
	}
}
s=new String(ch);
System.out.println(s);
}
}