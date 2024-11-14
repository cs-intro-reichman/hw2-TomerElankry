public class TimeCalc {
    public static void main(String[] args) {
        String s1 = args[0];
        int h1 = Integer.parseInt(""+s1.charAt(0)+s1.charAt(1)+"");
        int m1 = Integer.parseInt(""+ s1.charAt(3)+s1.charAt(4));
        int addT= Integer.parseInt(args[1]);

        int ttlT= h1 * 60 + m1 + addT;
        // int totalH= (ttlT / 60);
        int newH = ttlT / 60 ;
        int newM = ttlT % 60;

        String h2="";
        String m2="";
        if(newH>24) newH=newH%24;
        if(newH==24) newH= 0;
        if(newH<10) h2= "0"+ newH;
        else h2 = ""+newH;
        if(newM<10) m2 = "0" +newM;
        else m2 = ""+ newM;
        

        System.out.println(h2+":"+m2);




        

        
        
        
        


    }
}
