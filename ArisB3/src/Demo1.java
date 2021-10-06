import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) 
	
	{
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Age");
	    int age = myObj.nextInt();  
	    if(age>=18)
	    {
	      System.out.println("Major !" );
	    }
	    else
	    {
	      System.out.println("Minor.");
	    }

	}

}
