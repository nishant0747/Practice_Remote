package practice;

public class String_cha_pattern 

{
	
	public static void main(String[] args) 
	{
		
		String s = "Nishant";
		
		int l = s.length();
		
		for(int i =1; i<=7; i++)
		{
			
			for(int j=0; j<=l-7; j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
			l++;
			
		}
		
		
		
	}

}
