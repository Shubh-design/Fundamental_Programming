//Wajp to count how many Vowels and Consonents present in the String.
import java.util.Scanner;

class count_vowel_m2{
public static void main(String[] args)
{
int i,vc=0,cc=0;
Scanner in=new Scanner(System.in);
String s=in.nextLine();
s=s.toLowerCase();
String v="aeiou";
for(i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	 if(ch>='a' && ch<='z')
		if(v.indexOf(ch)>=0)
			vc++;
		else
			cc++;
}
System.out.println("vowels:"+vc);
System.out.println("consonents:"+cc);
}
}
/*
C:\Users\hp\string>java count_vowel_m2
shubham AEi
vowels:5
consonents:5
*/