import java.text.DecimalFormat;

public class squareRoot {
     public static void main(String[] args) {
    	 int n= 3;
    	 DecimalFormat decfor = new DecimalFormat("0"); 
    	 
    	 int k = Integer.valueOf(decfor.format(Math.sqrt(n)));
    	 System.out.println(k);
    	 
     }
}
