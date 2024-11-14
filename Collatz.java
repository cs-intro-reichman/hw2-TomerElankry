// Demonstrates the Collatz conjecture.

import java.io.Console;

public class Collatz {
	public static void main(String args[])
    {
	   int seed1 = Integer.parseInt(args[0]); //Integer that accepts the seed
	   int seed2=1;
	   int i=0;
	   boolean b1 = false;
	   String vc1 = args[1];
	   if(vc1.equals("v"))
	   {
	    for(int j = 1;j<=seed1;j++)
	     {
	        while(!b1)
		      {
				System.out.print(seed2+" ");
				if(seed2%2==0) seed2 = seed2/2;
				else seed2 = (seed2*3) + 1;
				if(seed2==1) 
				{
					System.out.print(seed2);
					b1 = true;
				}
				i++;
	         }
			b1 = false;
			seed2 = seed2 +j;
			System.out.print(" (" +(i+1)+")");
			System.out.println();
			i=0;
			
	     }
		 System.out.println("Every one of the first " + seed1 +" hailstone sequences reached 1.");
	   }
	   else System.out.println("Every one of the first " + seed1 +" hailstone sequences reached 1.");
	}
}
