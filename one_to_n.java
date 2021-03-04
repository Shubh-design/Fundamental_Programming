//Wajp to print from 1 to n.
import java.util.Scanner;
class one_to_n{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
/*int i=1;
while(i<n)
{
System.out.println(i);
i++;
}*/
for(int i=1;i<=n;i++)
System.out.println(i);
}
}