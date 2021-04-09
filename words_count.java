//Wajp to count how many words present in the sentence
class words_count{
static int c_w(String s)
{
char ch[]=s.toCharArray();
int wc=0;
for(int i=0;i<ch.length;i++)
{
if(i==0 && ch[i]!=' ')
wc++;
else if(ch[i]!=' ' && ch[i-1]==' ')
wc++;
}
System.out.println(wc);
return wc;
}

public static void main(String[] args)
{
String s="  Ram  and shyam"; 
int cnt=c_w(s);
}
}