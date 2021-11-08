import java.util.Scanner;

class Score 
{
	public static void main(String[] args) 
	{   

		int[] s1 =  {s1, s2, s3};
		int[] s2 =  {s1, s2, s3};
		int[] s3 =  {s1, s2, s3};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks obtained in first subject");
		int s1 = sc.nextInt();

		System.out.println("Enter the marks obtained in second subject");
		int s2 = sc.nextInt();

        System.out.println("Enter the marks obtained in third subject");
		int s3 = sc.nextInt();
        
		totalMarksAndAvgOfAllSub(s1, s2, s3);
		totalMarksAndAvgOfEachSub(s1, s2, s3);
		

	}

	public static void totalMarksAndAvgOfAllSub(int[] s1, int[] s2, int[] s3)
	{  
		Double total = 0;
		total=((s1[0]+s1[1]+s1[2]) + (s2[0]+s2[1]+s2[2]) + (s3[0]+s3[1]+s3[2]));
		System.out.println("The total marks of the three subjects is "+total);
		System.out.println("The average of the three subject is  "+total/3);
	}

	public static void totalMarksAndAvgOfEachSub(int[] s1, int[] s2, int[] s3 )
	{   
		double total = 0;
		for(int i=0; i<s.length; i++) 

			{
			   total=s1[i] + s2[i] + s3[i];
			   System.out.println("Total marks of the "+i+"subject is "+ total);
			   System.out.println("average of the "+i+"subject is "+ total/3);
			
		    }

	}

}