public class Patterns
{
	public static void main(String[] args)
	{
		System.out.println("Question 1");
		System.out.println();
		int n=11;
		int m=5;
		int i=0;
		int j=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0 || j==n/2 || i==n-1 )
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print(" ");
			for(j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || i==j)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(j=0;j<n;j++)
			{
				if(i==0 || j==0 || i==n-1 || (i==(n-1)/2 && j<(3*n)/4))
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(j=0;j<n;j++)
			{
				if(j==0 && i<n-1 || j==n-1 && i<n-1 || (i==n-1 && j>0 && j<n-1))
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(j=0;j<n;j++)
			{
				if(j==0 || i==0 && j<n-1 || i==n/2 && j<n-1 
						|| j==n-1 && i!=0 && i<n/2 || (i==n-1 && j==n-1) || 
						(i==n-2 && j==n-2) || (i==n-3 && j==n-3) || (i==n-4 && j==n-4) || (i==n-5 && j==n-5))
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(j=0;j<n;j++)
			{
				if(j==0 && i>0 && i<n-1 || j==n-1 &&
						i>0 && i<n-1 || i==0 && j>0 && j<n-1
						|| i==n-1 && j>0 && j<n-1 )
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || i==j)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
				System.out.println();	
		}		
		
		System.out.println();
		System.out.println("Question 2");
		System.out.println();
		for(i=1;i<m;i++)
		{
			for(j=1;j<m;j++)
			{
				System.out.print(i);
			}
				System.out.println();
			}
			System.out.println();
			System.out.println("Question 3");
			System.out.println();
			{	
				
				for(i=0;i<n;i++)
				{
					for(j=0;j<n;j++)
					{
						if(i==0 || j==0 || j==n-1 || i==n-1 || i+j<=(n-1)/2 || j-i>=(n-1)/2)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
				System.out.println();
				}
			}
			System.out.println();
			System.out.println("Question 4");
			System.out.println();
			{
				
				for(i=0;i<n;i++)
				{
					for(j=0;j<n;j++)
					{
						if(i-j>=(n-1)/2 || i+j>=n-1+(n-1)/2)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
				System.out.println();
				}
			}
			System.out.println();
			System.out.println("Question 5");
			System.out.println();
			{	
				
				for(i=0;i<n;i++)
				{
		for(j=0;j<n;j++)
					{
						if(i==0 || i==n-1 || i-j>=(n-1)/2 || i+j<=(n-1)/2)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
				System.out.println();
				}
			}
	}
}