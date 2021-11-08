public class StudentResult 
{
	public static void main(String[] args) 
	{

		int sub1=45,sub2=75,sub3=67;

		if(sub1 > 60 && sub2 > 60 && sub3 > 60) 
			{
			System.out.println("The student is passed");
		    }
		else if((sub1 > 60 && sub2 > 60) || (sub2 > 60 && sub3 > 60) || (sub1 > 60 && sub3 > 60))
			{ 
			System.out.println("The student is Promoted");
			
		    }
		else if((sub1 > 60 || sub2 > 60 || sub3 > 60) || (sub1 < 60 && sub2 < 60 && sub3 < 60)) 
			{
			System.out.println("The student is failed");
			
		    }
	}

	
}