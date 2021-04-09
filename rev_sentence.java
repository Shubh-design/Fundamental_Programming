//reverse the sentence.
class rev_sentence{
public static void main(String[] args)
{
String s="Rama and Laxmana";
String rev="";
int i,k;
char ch[]=s.toCharArray();
for(i=0;i<ch.length;i++)
{
k=i;
while(i<ch.length && ch[i]!=' ')
{
i++;
}
int j=i-1;
while(j>=k)
{
rev=rev+ch[j];
j--;
}
if(i<ch.length)
rev=rev+ch[i];
}
System.out.println(rev);
}
}
/*

C:\Users\hp\string>javac rev_sentence.java

C:\Users\hp\string>java rev_sentence
amaR dna anamxaL
*/