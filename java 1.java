class Armstrong 
{
	public static void main(String[] args) 
	{
		int num = 153 rem, c, sum = 0, temp = 153;
		while(n > 0)
		{
			rem = num % 10;
			c = rem * rem * rem;
			sum = sum + c;
			num = num / 10;

		}

		temp = num;

		if ( num == sum)
		{
			System.out.println(num+ " is a Armstrong number");
		}

		else
		{
			System.out.println(num+ "is not a Armstrong number");

		}

		
	}
}