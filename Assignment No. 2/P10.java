class P10
{
  public static void main (String [] args)
 {
   int i,j;
   int a= 64;
   for(i=1;i<=5;i++)
     {
        for(j=1;j<=5;j++)
		 {
		   if(j>=6-i)
		   {
		   System.out.print(  (char)  (j+a )+" "  );
	  
		   }
		   else
		   System.out.print(" ");
		 }
		 System.out.println();
     }	 
 }
}