package pp;

import java.util.Scanner;

public class Gpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		   System.out.println("enter the rows");
		   int n=scn.nextInt();
		   for(int i=0;i<n;i++)
		   {
			   for(int j=0;j<n;j++)
			   {
				   if((j==0 && i!=0 && i!=n-1) || (i==0 && j!=0) || (i==n-1 && (j<n/2 && j!=0))
						   || (j==n/2 && i>(3*n)/4) || (i==(3*n)/4 && j>=n/2 && j<=n-1)
						   || j==n-1 && i>(3*n)/4)
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
