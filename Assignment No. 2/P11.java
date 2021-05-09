
class P11
{
public static void main(String [] args)
{
  int i,j,k,m;
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
}
}
