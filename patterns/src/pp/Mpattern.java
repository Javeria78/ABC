package pp;

import java.util.Scanner;

public class Mpattern {
	public static void main(String[] args) {
		
	
	Scanner scn=new Scanner(System.in);
	   System.out.println("enter the rows");
	   int n=scn.nextInt();
	   for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<n;j++)
		   {
			   if (j==0 || j==n-1 || (i==j || i+j==n-1) && i<=n/2 )	 
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
	   scn.close();
		}

	
}


