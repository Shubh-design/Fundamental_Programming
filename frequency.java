class frequency{
public static void main(String[] args)
{
int i,j;
String s="1234 shubh";
int count[]=new int[128];
for(i=0;i<s.length();i++)
{
char ch=s.charAt(i);
//if(ch<='A' && ch>='Z' || ch<='a' && ch>='z')
count[ch]++;
}
for(i=0;i<count.length;i++)
if(count[i]>0)
System.out.println((char)i+" "+count[i]);

}
}