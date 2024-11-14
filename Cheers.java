// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) 
        {
	     String cheerS = args[0];
         cheerS = cheerS.toUpperCase();
         int numR = Integer.parseInt(args[1]);
         int i =0;
         while (i<cheerS.length())
            {
                if(cheerS.charAt(i)=='A' || cheerS.charAt(i)=='E' ||cheerS.charAt(i)=='F' ||cheerS.charAt(i)=='H' ||cheerS.charAt(i)=='I' ||cheerS.charAt(i)=='L' ||cheerS.charAt(i)=='M' ||cheerS.charAt(i)=='N' ||cheerS.charAt(i)=='O' ||cheerS.charAt(i)=='R' ||cheerS.charAt(i)=='S' ||cheerS.charAt(i)=='X')
                {
                System.out.println("Give me an "+cheerS.charAt(i)+": "+(cheerS.charAt(i)+"!"));
                }
                else{ System.out.println("Give me a  "+cheerS.charAt(i)+": "+(cheerS.charAt(i)+"!"));}
                i++;
                
            }
         for(int j=0;j<numR;j++)
            {
                System.out.println(cheerS+"!!!");
            }
        }
}
