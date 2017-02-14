import java.util.Scanner;
public class big
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a first number : ");
        a = scan.nextInt();
		      System.out.print("Enter a 2 nd  number : ");
		  b = scan.nextInt();
		  System.out.print("Enter a 3 rd  number : ");
		  c = scan.nextInt();
		  
        if((a>b && a>c))
        {
            System.out.print(a + " is  biggest");
        }
        else if(b>a && b>a)
        {
            System.out.print(b + " is biggest");
        }
		else
		{ System.out.print(c + " is biggest");
		}
    }
}