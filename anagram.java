//Wajp to check user entered two strings are anagram or not.
class anagram{
static boolean isAnagram(String s1,String s2)
{
int c1[]=new int[26];
for(int i=0;i<s1.length();i++)
{
char ch=s1.charAt(i);
if(ch>='A' && ch<='Z')
c1[ch-65]++;
else if(ch>='a' && ch<='z')
c1[ch-97]++;
}

int c2[]=new int[26];
for(int i=0;i<s2.length();i++)
{
char ch=s2.charAt(i);
if(ch>='A' && ch<='Z')
c2[ch-65]++;
else if(ch>='a' && ch<='z')
c2[ch-97]++;
}

for(int i=0;i<26;i++)
	if(c1[i]!=c2[i])
		return false;

return true;
}

public static void main(String[] args)
{
int i,j;
String s1="Listen";
String s2="Silentz";
boolean rs=isAnagram(s1,s2);
if(rs)
System.out.println("anagram");
else
System.out.println("Not a anagram");
}
}