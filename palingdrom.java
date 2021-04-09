//Wajp to check user entered string is pangram or not.
class palingdrom{
public static void main(String[] args)
{
int i,j;
String s="Jahaj";
//String lc=s.toLowerCase();
String uc="";
for(i=s.length()-1;i>=0;i--)
{
uc=uc+s.charAt(i);
}
if(uc.equalsIgnoreCase(s))
System.out.println("Palingdrom "+" "+uc);
else
System.out.println("Not a Palingdrom");
}
}