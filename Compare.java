import java.util.Scanner;
import java.io.*;
public class Compare {

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if(number>0) 
            System.out.println("Number is positive.");
	else if(number<0)
		System.out.println("number is negative");
	else 
		System.out.println("number is zero");
    }
}
