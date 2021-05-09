class Pattern12
{
  public static void main(String [] args)
  {
    int i,j;
	 for (i=1;i<=5;i++)
      {
        for(j=1;j<=5;j++)
          {
           if (j>=1 && j<=6-i)
            {
			   System.out.print("*");
			   
			}
			else
			System.out.print(" ");
          }
		  System.out.println();
       }
 for (i=1;i<=4;i++)
      {
        for(j=1;j<=5;j++)
          {
           if (j>=1 && j<=i+1)
            {
			   System.out.print("*");
			   
			}
			else
			System.out.print(" ");
          }
		  System.out.println();
       }	   
  }
}