class Pattern4{
	public static void main(String args[]){
		int n=5;
		for(int i=5; i>=0;i--)
		{
			for(int j=1;j<=5;j++)
			{
				if(n/j==2.5)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}