class CUI 
{
	public static void main(String[] args) 
	{
		validCredentials();
		loginCredentials();
	}

	public static void validCredentials()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the valid userID");
		String ID = sc.next();
		System.out.println("enter the valid password");
		String pass = sc.next();
		loginCredentials(ID,pass);

	}

	public static void loginCredentials(String ID, String pass)
	{   
		String userId, Password;
		int count;
		if(userId == ID && Password == pass)
		{
			System.out.println("welcome");
		}
		
		else
		{
			if(count < 3)
			{ 
				validCredentials();
				count++;
				
			}
			else
			{
				System.out.println("Contact Admin");
			}
		}
	}
}