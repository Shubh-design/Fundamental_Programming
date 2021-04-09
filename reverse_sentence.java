//Wajp to reverse the sentence
class reverse_sentence{
public static void main(String[] args)
{
String s="Rama and Laxmana";
String rev="";
int i,k;
char ch[]=s.toCharArray();
for(i=ch.length-1;i>=0;i--)
{
k=i;
while(i>=0 && ch[i]!=' ')
{
i--;
}
int j=i+1;
while(j<=k)
{
rev=rev+ch[j];
j++;
}
if(i>=0)
rev=rev+ch[i];
}
System.out.println(rev);
}
}
/*
C:\Users\hp\string>javac reverse_sentence.java
C:\Users\hp\string>java reverse_sentence
Laxmana and Rama
*/