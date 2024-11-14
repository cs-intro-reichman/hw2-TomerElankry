// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{ 
		int ind = Integer.parseInt(args[0]);
		double sum1 = 1.0;
		int dem=3;
		for(int i =0;i<ind-1;i++)
		{
			if(i%2==0) sum1 = sum1 - (double)1/dem;
			else sum1 = sum1 + (double)1/dem; 
			dem = dem +2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum1*4);
	    
	}
}
