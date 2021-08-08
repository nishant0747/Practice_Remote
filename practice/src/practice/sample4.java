package practice;

public class sample4 
{
	public static void main(String[] args)
	{
		String Username = "nishant4040";
		String Password = "T@rzan747";
		
		if(Username=="nishant4040")
		{
			System.out.println("correct username");
			
			if(Password=="T@rzan747")
			{
				System.out.println("correct password");
				System.out.println("Login successful");
			}
			else
			{
				System.out.println("wrong password");
				System.out.println("login failed");
				
			}
		}
		else
		{
			System.out.println("wrong username");
			System.out.println("login failed");
		}
		
	}

}
