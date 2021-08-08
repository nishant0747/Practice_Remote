package practice;

public class Switch 
{
	public static void main(String[] args) 
	{
		
		String options = "CP";
		
		switch(options)
		{
		case "MT":System.out.println("------money transfer------");
		break;
		case "MS":System.out.println("-----mini statement-----");
		break;
		case "BI":System.out.println("-----balance enquiry------");
	    break;
		case "CP": System.out.println("------change pin------");
		break;
		case "CW": System.out.println("------cash withdrawl------");
		break;
		default: System.out.println("wrong input");

		}	
	}

}
