import java.util.Scanner;

public class Exceptions 
{
	public static void main(String[] args) 
	{
		 
	  int a, b, result;
	  result =0;
	 
	  Scanner input = new Scanner(System.in);
	  System.out.println("Input two integers");
	 
	  a = input.nextInt();
	  b = input.nextInt();
	  
	  try
	  {
		  result = a / b;
	  }
	  catch (Exception e)
		{
		    if(b==0) System.out.println("Second variable is 0");
		}
	  System.out.println("Result = " + result);
	}
	
	
}
