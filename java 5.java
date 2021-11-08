import java.util.Scanner;

    public class IncomeTax 
    {

	public static void main(String[] args)
	{
		double tax = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your total earning");
		int sal = scanner.nextInt();

		if(sal>0 && sal<180000) 
			{
			     System.out.println("There is no income tax for thsi salary");
		    }
		else if(sal >= 180001 && sal <= 300000)
			{
			    tax = ((sal-180000) * 0.1);
			    System.out.println("The amount of payable tax is "+tax);
		    }
		else if(sal >=300001 && sal <= 500000) 
			{
			    tax = ((sal-180000) * 0.2);
			    System.out.println("The amount of payable tax is "+tax);
		    }
		else if(sal >= 500001 && sal <= 1000000)
			{
			    tax = ((sal-180000) * 0.3);
			    System.out.println("The amount of payable tax is "+tax);
		    }

	}

} 