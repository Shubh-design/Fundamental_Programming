class panagram_index
{
public static void main(String[] args)
{
boolean flag=false;
String s="abcdefghijklmnopqrstuvwxyz";
String s1="abcdefghijklmnopqrstuvwxyzq";
if(s1.length()<26)
System.out.println(" not a panagram");
else{
for(int i=0;i<s1.length();i++)
if(s1.indexOf(s.charAt(i))>=0)
	flag=true;
else 
{
	flag=false;
System.out.println(" not a panagram");
	return ;
}
}
if(flag)
System.out.println("panagram");
}
}