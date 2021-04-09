package matrix;
import java.util.Scanner;
public class even_odd_present_in_matrix {
public static void main(String[] args) {
	int a[][]=new int[3][3];
	Scanner in=new Scanner(System.in);
	for(int i=0;i<a.length;i++)
		for(int j=0;j<a[i].length;j++)
			a[i][j]=in.nextInt();
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++)
			System.out.print(a[i][j]);
	System.out.println();
}
	int b[]=odd_even(a);
	System.out.println("even"+b[0]);
	System.out.println("odd"+b[1]);
	System.out.println("count of prime no.s:"+b[2]);
}

private static int[] odd_even(int[][] a) {
	int e=0,o=0,cnt = 0;
	boolean rs=false;
	for(int i=0;i<a.length;i++)
		for(int j=0;j<a[i].length;j++)
			if(a[i][j]%2==0)
				e++;
			else
				o++;
	
	
	for(int i=0;i<a.length;i++) 
	{
		for(int j=0;j<a[i].length;j++)
			 {
				rs=prime(a[i][j]);
			 	if(rs==true)
			 		cnt++;
			 }
	}
	int b[]=new int[3];
	b[0]=e;b[1]=o;b[2]=cnt;
	return b;
}

public static boolean prime(int a) {
	if(a==1)
		return false;
	
	for(int i=2;i<=a/2;i++)
		if(a%i==0)
			return false;
	
		return true;

}
}
/*
 * 1 2 3 4 5 6 7 8 9
123
456
789
even4
odd5
count of prime no.s:4
 */