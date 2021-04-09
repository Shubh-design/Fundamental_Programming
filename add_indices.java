//add indices of array to get desired target sum.
import java.util.Scanner;
class add_indices{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int t=in.nextInt();
boolean f=true;
int b[][]=new int[3][2],k=0,l=0,i,j;
while(t>0){
int n=in.nextInt();
int target=in.nextInt();
int a[]=new int[n];
for(i=0;i<a.length;i++)
a[i]=in.nextInt();
for(i=0;i<a.length-1;i++)
for(j=i+1;j<a.length;j++)
if(a[i]+a[j]==target){
while(l<2){
b[k][l++]=i;
b[k][l++]=j;
}
k++;
l=0;
}
t--;
}
for(k=0;k<3;k++){
for(l=0;l<2;l++)
System.out.print(b[k][l]+" ");
System.out.println();
}
}
}
/*C:\Users\hp\string>javac add_indices.java

C:\Users\hp\string>java add_indices
3
4 18
7 2 11 15
4 40
40 2 3 37
8 2
23 57 14 2 6 0 5 7
0 2
2 3
3 5
*/