import java.io.*;
import java.lang.Math;
import java.util.Scanner;
class sumnat 
{
	public static void main(String args[])
	{ int l;
	int s=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the limit");
	l=sc.nextInt();
	for(int i=0;i<=l;i++)
	{ s = Math.addExact(s,i);
	}
	System.out.print("the sum of "+l);
	System.out.print("natural no is "+s);
	}
}