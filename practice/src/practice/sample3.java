package practice;

public class sample3
{
	public static void main(String[] args) 
	{
		int display = 400;
		
		if(display>=1000)
		{
			System.out.println("STOP");
		}
		
		else if(display>=700)
		{
			System.out.println("Top speed");
		}
		
		else if (display>=300)
		{
			System.out.println("moderate speed");	
		}
		
		else if(display>=1)
		{
			System.out.println("Low speed");
		}
		
		else
		{
			System.out.println("OFF");
		}
		
		
	}

}
