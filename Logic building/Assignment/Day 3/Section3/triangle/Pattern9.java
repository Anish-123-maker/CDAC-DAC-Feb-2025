class Pattern9{
	public static void main(String args[]){
		for(int i=5; i>0;i--)
		{
			for(int j=5; j>=i;j--)
			{
				System.out.print(j);
				if(j>i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}