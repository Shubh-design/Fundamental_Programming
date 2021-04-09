//Wajp to check user entered string is pangram or not.
class palingdrom_without_reverse{
public static void main(String[] args)
{
String s="jahaj";
int i=0,j=s.length()-1;
boolean rs=true;
while(i<j)
{
if(st[i]!=ch[j])
 rs=false;
i++;
j--;
}
if(rs)
System.out.println("Palingdrom "+" "+s);
else
System.out.println("Not a Palingdrom"+s);
}
}