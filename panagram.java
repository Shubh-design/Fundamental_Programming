class panagram{
static boolean isPanagram(String s)
{
int i,count[]=new int[26];
if(s.length()<26)
{
	System.out.println("not a panagram");
	return false;
}
else
{
	for(i=0;i<s.length();i++)
	{
	char ch=s.charAt(i);
	count[ch-97]++;
	}
for(i=0;i<count.length;i++)
if(count[i]==0)
return false;

return true;
}
}

public static void main(String[] args)
{
String s="abcdefghijklmnopqrstuvwxyz";
boolean rs=isPanagram(s);
if(rs)
System.out.println(" panagram");
else 
System.out.println("not a panagram");
}
}