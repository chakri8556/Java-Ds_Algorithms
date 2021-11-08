 class BubbleSort 
{
	public static void main(String[] args) 
	{
		int a[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
          
		  System.out.println("Arrays before sorting" +Arrays.toString(a));
		

		for (int i=0; i<n-1; i++ )
		{
			for (int j=0; j<n-1-i ; j++ )
			{
				if(a[j] > a[j+1])
				{
				   int temp = a[j];
				   a[j] = a[j+1];
				   a[j+1] = temp;
				}

	         }
         }

        System.out.println("Arrays arrys sorting" +Arrays.toString(a));

	}
}