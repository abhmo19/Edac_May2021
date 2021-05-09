class P6
{
 public static void main(String [] args)
 {
	
 for (int i = 1; i<=9; i+=2)
   {
        for(int j = 1; j<=9; j++)
	      {
			  if(j%2==1)
	          {
		      if(j>=10-i)
		      {
			
			  System.out.print("*");
			 }		  
            else
              System.out.print(" ");
		  }
	   
	   else 
              System.out.print(" ");
		  }  
		 System.out.println();
   }
	   
		  
		
}
}		 