import java.io.*;
import java.util.Scanner;
class digit 
{
	public static void main(String args[])
	{ 
		int count=0;
		int num=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the integer");
	num = sc.nextInt();
	while(num>0)
	{  num=num/10;
	count++;
	}
	System.out.print("number of digits in given number is "+count);
	}
}