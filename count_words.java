import java.util.*;
class count_words{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String s=in.nextLine();
char ch[]=s.toCharArray();
int cnt=0;
for(int i=0;i<ch.length;i++){
if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z' || ch[i]==' ' || ch[i]=='-')
if(ch[i]==' ')
cnt++;
}
System.out.println(cnt);
}
}