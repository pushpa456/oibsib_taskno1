package progran;
import java.util.Scanner;
import java.util.Random;
public class randomnum
{
  public static void main(String args[])
   {
	  int a=0,b=0,c=0,z=0;
	  Random num = new Random();
	  Scanner scanner = new Scanner(System.in);
	  
	  while(z<=1)
	{	  
	  System.out.println("You Need 100 points to win chances you have=10");
	  System.out.println("Game Starting now");
	  System.out.println("Guess the Number from 0 to 99");
	  
	    a =num.nextInt(100);
	  int n;
	   for( n=1;n<=10;n++)
	   {
		        System.out.println("Your guess = " +n+" ");
			b=scanner.nextInt();
			if(a==b)
			  {
				System.out.println("Congratulations your Guess is right");
				System.out.println("");
			    
				c=100;
				break;
			  }
			else if(b<a)
			  {
			  System.out.println("Your Guess is Less then Random Number");
			  System.out.println("");
			  
			  }	
			else if(b>a)
			  {
			  System.out.println("Your Guess is Higher then Random Number");
			  System.out.println("");
			  
			  }
			
			
	   }
	   int d=10;
	       c=c+d;
	  if(a==b)
	  {
		  System.out.println("Your Total Score is"+c+"");
	      System.out.println("Yeah Congrats You Won");
	  }
	  else
	  {
		  System.out.println("Your Total Score is"+n+"");
	   System.out.println("Random number was"+a+"");
	  }
	   System.out.println("");
	   System.out.println("-----------------------------------");
	   System.out.println("Press 1 to continue playing");
	   System.out.println("Press 2 to continue exit");
	    System.out.println("-----------------------------------");
	   z=scanner.nextInt();
	   
		  
	   
	}   
   }
}   
			
	