//Wajp to read the string from the user and count how many Capital letters ,
//small letters,digits and special characters present in the string.
class count_char_array{
public static void main(String[] args)
{
int uc=0,lc=0,dc=0,spc=0;
String s="Shubham Jaiswal";
char ch[]=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(ch[i]>='A' && ch[i]<='Z')
uc++;
else if(ch[i]>='a' && ch[i]<='z')
lc++;
else if(ch[i]>='0' && ch[i]<='9')
dc++;
else
spc++;
}
System.out.println("upper chars:"+uc);
System.out.println("lower chars:"+lc);
System.out.println("digit :"+dc);
System.out.println("special chars:"+spc);
}
}
/*
C:\Users\hp\string>java count_char
upper chars:2
lower chars:12
digit :0
special chars:1*/