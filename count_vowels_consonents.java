//Wajp to count how many Vowels and Consonents present in the String.
import java.util.Scanner;

class count_vowels_consonents{
public static void main(String[] args)
{
int i,j,vc=0,cc=0;
Scanner in=new Scanner(System.in);
String s=in.nextLine();
for(i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	if(ch>='A' && ch<='Z')
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			vc++;
		else
			cc++;
	else if(ch>='a' && ch<='z')
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			vc++;
		else
			cc++;
}
System.out.println("vowels:"+vc);
System.out.println("consonents:"+cc);
}
}
/*
C:\Users\hp\string>java count_vowels_consonents
aeiOUsh
vowels:5
consonents:2*/