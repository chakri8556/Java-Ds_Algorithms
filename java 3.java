 import java.util.Scanner;

class SimpleCompoundInterest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal");
		Double principal = sc.nextDouble();

		System.out.println("Enter the rate");
		Double rate = sc.nextDouble();

		System.out.println("Enter the time");
		Double time = sc.nextDouble();

		simpleInterest();
		compoundInterest();


		public static void simpleInterest()
		{
			Double Interest = (principal * time * rate)/100;
			System.out.println("Simple Interest : " +Interest);
		}

		public static void compoundInterest()
		{  
            System.out.println("Enter the number of times it was compounded : ");
			int number = sc.nextInt();
			Double compInterest = principal * (Math.pow( 1 + rate/100), (time * number)) - principal;
			System.out.println("compound Interest : " compInterest);


		}


	}
}