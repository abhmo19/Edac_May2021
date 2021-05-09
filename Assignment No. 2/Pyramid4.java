class Pyramid4
{
public static void main(String [] args)
{
for (int i=1;i<=9;i++)
   {
     for (int j=9;j>=i;j--)
	  {
	   System.out.print(" ");
	   }
	   for (int k=1;k<=i;k++)
	    {
		 System.out.print(k);
		 }
		
   
		 for(int m=0;m<=7;m++)
	 {
		 for (int n=m+1;n>0;n--)
		 {
			  System.out.print(n);
		 }
		
	 }
	 System.out.println();
   }	
   
			 
}
}	