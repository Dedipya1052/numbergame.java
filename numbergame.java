package studyopedia;

import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class Main  
{
	public static void main(String[] args) {
	
    Scanner num = new Scanner(System.in);
	Random rand = new Random();
	Scanner ch = new Scanner(System.in);
	System.out.print("Number Game:\n");
	System.out.print("\n Guess the random number generated by the system. \n You have 5 chances to guess correctly.\n");
	boolean again = true;
	int limit = 5,c = 1,i;
	while(again)
	{
	int r = rand.nextInt(100);
	//System.out.println(r);
	System.out.print("\nThe number is randomly generated. FIND IT..!\n");
	
	for(i = 1;i <= limit;i++)
	{
	System.out.print("\nGuess "+i+": ");
	int n = num.nextInt();
	if(n == r)
	{
	    System.out.print("Yess....You got the correct number.\n");
	    System.out.println("No. of tries= "+c+"\n\n");
	    if(c == 1){
	        System.out.print("Score: 100");
	    }
	    else if(c == 2){
	        System.out.print("Score: 90");
	    }
	    else if(c == 3){
	        System.out.print("Score: 80");
	    }
	    else if(c == 4){
	        System.out.print("Score: 70");
	    }
	    else if(c == 5){
	        System.out.print("Score: 50");
	    }
	    
	    System.out.print("\nWill you continue the game??? (Yes / No)\n");
	    String pa = ch.next();
	    System.out.print("\n");
	    again = pa.equalsIgnoreCase("Yes");
	    break;
	   
	}
	else if(n - 2 == r || n - 1 == r || n + 1 == r || n + 2 == r)
	{
	    System.out.print("You are close to number..!\n");
	}
	else if(n < r)
	{
	    System.out.print("Very Low..!\n");
	}
	
	else if (n > r)
	{
	    System.out.print("Very High...!\n");
	}
	else
	{
	    System.out.print("Try Again\n");
	}
	c++;
	    }//End of for loop
	    
	    if(c >= 5)
	{
	    System.out.print("You have no chances left..\nYour score is 0\n");
	    System.out.print("The Number is "+ r+"\n");
	    
	    System.out.print("\nTry Again?? (Yes / No)\n");
	    String pa = ch.next();
	    System.out.print("\n");
	    again = pa.equalsIgnoreCase("Yes");
	    break;
	}
	}//end of while loop
	System.out.print("\nI wish you had a crazy time..\n   ** BYE **");
}
}
