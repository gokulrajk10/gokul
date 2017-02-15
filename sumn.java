import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class sumn 
{
	public static void main(String args[])
	{ int n;
	int s=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the limit");
	n=sc.nextInt();
	if(n==0)
	System.out.println("enter the valid limit");
	for(int i=0;i<=n;i++)
	{ s=Math.addExact(s,i);
	}
	System.out.println("the sum of "+n);
	System.out.println(" no is "+s);
	}
}
