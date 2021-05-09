class Pattern7
{
public static void main(String [] args)
{
int i,j,k,m,n=1;
for (i=1;i<=5;i++)
  {
	  for(j=4;j>=i;j--)
	  {
		  System.out.print(" ");
	  }
	  for (k=1;k<=i;k++)
	  {
		  System.out.print("*");
		 }
		for(m=1;m<i;m++)
		{ 
          System.out.print("*");
		}	
		 System.out.println();
	}	 
  for (i=1;i<=4;i++)
   {
     
	  for(j=1;j<=8;j++)
	  {
	
		 if(j>=i+n && j<=9-i) 
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