/*
 * Courtney Jo Young
 * young2cj@mail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
	
		 int j,n,s,x;
		char i;
	            
		 
		 n=5;
		 s=n+4-1;
		 
		  for(i=1;i<=n;i++)
          {
          	
          	{
	            	
	            	
          	}
          	 for(x=s;x!= 1;x--)
             {
            System.out.print(" ");
             }
	             for(j=1;j<=i;j++)
	             {
	            	 if (i==2)
	            		 i= i+ "i";
	            	 System.out.print(i+ " ");
	              }
	         	System.out.println();
	             s--;
	           
	             
	            	 
	            
		}
	}
}
