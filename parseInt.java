//Wajp to convert no. into string. eg 123 - One hundred and twenty three
import java.util.Scanner;
class parseInt{
static void nw(int x,String s)
{
String one[]={"","one","two","three","four","five","six","seven"
	"eight","nine","ten","eleven","twelve","thirteen",
	"fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
String two[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
if(x<20)
System.out.println(one[x]);
else
System.out.println(two[x/10]+" "+one[x%10]);
if(x!=0)
System.out.println(s+" ");
}
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
nw(n/1000000,"crore");
nw(n/10000%100,"lakh");
nw(n/1000%100,"thousand");
nw(n/100%10,"hundred");
nw(n%100,"");
}
}