package Methods;

public class Assignment1 {
	
	public static void main (String [] args)
	{
		
		int n =10;
		
		System.out.println();
		System.out.println("Question 1");
		System.out.println();
		for (int j=0; j<n; j++)
		{
			for(int i =0; i<n; i++ )
			{
				if( i==(n-1)/2 || j==0|| j==n-1 )//I
				{
					System.out.print("*");
				}else 
				{
					System.out.print(" ");	
				}
			}
		
			System.out.print("   ");//N
			for(int i =0; i<n; i++ )
			{
				if(i==0|| i==n-1||i==j)
				{
					System.out.print("*");
				}else 
				{
					System.out.print(" ");
				}
			}
			
			System.out.print("   ");//E
			for(int i =0; i<n; i++ )
			{
				if(i==0|| j==(n-1)/2 || j==0|| j==n-1 )
				{
					System.out.print("*");
				}else 
				{
					System.out.print(" ");
				}
			}
			
			System.out.print("    ");// U
			for(int i =0; i<n; i++ )
			{
				if((i==0 && j!=n-1) || i==n-1 && j!=n-1 || j==n-1 && i!=n-1 && i!=0  )
				{
					System.out.print("*");
				}else 
				{
					System.out.print(" ");
				}
			}
			

			System.out.print("     ");//R
			for(int i =0; i<n; i++ )
			{
				if(i==0 && j>0 || j==0 && i>0 && i<n-1 || i==n-1 && j<(n-1)/2 && j>0 || j==(n-1)/2 && i>0 && i<n-1 || j==i && j>3  )
				{
					System.out.print("*");
				}else 
				{
					System.out.print(" ");
				}
			}
			
			
			
			
			System.out.print("   ");//O
			for(int i =0; i<n; i++ )
			{
				if( i==0 && j>0 && j<n-1 || 
					j==0 && i>0 && i<n-1 ||
					i==n-1 && j>0 && j<n-1 ||
					j==n-1 && i>0 && i<n-1)
				{
					System.out.print("*");
				}else 
				{
					System.out.print(" ");	
				}
			}
			

		
			
			System.out.print("    ");//N
			for(int i =0; i<n; i++ )
			{
				if(i==0||  i==n-1 ||i==j)
				{
					System.out.print("*");
				}else 
				{
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("Question2");
		System.out.println();
		
		for(int i=1; i<=4; i++)
		{
			for(int y=0; y<4; y++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int num =20;
		System.out.println();
		System.out.println("Question 3");
		for (int j = 0; j<num; j++)
		{
			
			for(int i =0; i<num; i++ )
			{
				if(i==0 || i==num-1 || j==0 || j==num-1 || i+j <= (num-1)/2 || i-j>= (num-1)/2)
				{
					System.out.print("*");
				}else 
				{
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("Question 4");
		System.out.println();
		
		//Question----->
		for (int j = 0; j<num; j++)
		{
			for(int i =0; i<num; i++ )
			{
				if( j-i>= (num-1)/2 || j+i>= num+((num-1)/2)-1)
				{
					System.out.print("*");
				}else 
				{
					System.out.print(" ");	
				}	
			}
			System.out.println("      ");				
		}
	
		
		
		
		
		System.out.println();
		System.out.println("Question 5");
		System.out.println();
		
		//Question----->
		for (int j = 0; j<num; j++)
		{
			for(int i =0; i<num; i++ )
			{
				if(i==0  || j==0 || j==num-1 || i+j <= (num-1)/2 || j-i>= (num-1)/2)
				{
					System.out.print("*");
				}else 
				{
					System.out.print(" ");					
				}
			}
			System.out.println("      ");				
		}
		
			
		
	}

}
