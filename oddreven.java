import java.util.Scanner;
 
class oddreven
{
   public static void main(String args[])
   {
      int x;
      System.out.println("Enter the number ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
 
      if ( x % 2 == 0 )
         System.out.println("You entered an even number.");
      else
         System.out.println("You entered an odd number.");
   }
}