import java.util.Scanner;
 
class leap
{
   public static void main(String args[])
   {
      int x;
      System.out.println("Enter the year ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
 
      if ( x % 4 == 0 )
         System.out.println("You entered a leap year.");
      else
         System.out.println("You entered not a leap year.");
   }
}