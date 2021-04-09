import java.util.Scanner;
class subarray{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
System.out.println("enter N value");
int n=in.nextInt();
System.out.println("enter P value");
int p=in.nextInt();
int a[]=new int[n],b[]=new int[a.length+5],k;
System.out.println("enter elements");
for(int i=0;i<a.length;i++)
a[i]=in.nextInt();
for(k=0;k<a.length;k++)
b[k]=a[k];
for(int i=0,j=i+1;j<a.length;i++,j++)
b[k++]=a[i]+a[j];
for(int i=0;i<a.length;i++)
b[k]+=a[i];
for(int i=0;i<b.length;i++)
b[i]=b[i]%p;
int max=0;
for(int i=0;i<b.length;i++)
if(max<b[i])
max=b[i];
int cnt=0;
for(int i=0;i<b.length;i++)
if(b[i]==max)
cnt++;
System.out.println(max+" "+cnt);
}
}