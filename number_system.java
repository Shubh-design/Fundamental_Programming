import java.util.Scanner;
class number_system{
static String dectobin(int dec)
{
String bin="";
do{
int r=dec%2;
bin=r+bin;
dec=dec/2;
}while(dec!=0);
return bin;
}
static String dectooct(int dec)
{
String oct="";
do{
int r=dec%8;
oct=r+oct;
dec=dec/8;
}while(dec!=0);
return oct;
}
static String dectohex(int dec)
{
String hx="";
do{
int r=dec%16;
if(r<10)
hx=r+hx;
else 
hx=(char)(r+55)+hx;
dec=dec/16;
}while(dec!=0);
return hx;
}
static int bintodec(int bin){
int dec=0,pw=1;
do{
int r=bin%10;
dec=dec+r*pw;
pw=pw*2;
bin=bin/10;
}while(bin!=0);
return dec;
}
static int octtodec(int oct)
{
int dec=0,pw=1;
do{
int r=oct%10;
dec=dec+r*pw;
pw=pw*8;
oct=oct/10;
}while(oct!=0);
return dec;
}
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();

System.out.println("binary no.="+dectobin(n));
System.out.println("octal no.="+dectooct(n));
System.out.println("hexadecimal no.="+dectohex(n));
int bin=1100;
System.out.println("binary to decimal="+bintodec(bin));
int oct=654;
System.out.println("octal to decimal="+octtodec(oct));
}
}