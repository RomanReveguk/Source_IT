package Dz;

import java.math.BigInteger;

public class MyApp4 {
	public static void main(String[] args) {
		
//			  int x = Integer.parseInt(args[0]);
//			  int y = Integer.parseInt(args[1]);
//			  System.out.println("x + y = " + x + y);
		String str = "ACDC";  // or anything else

	    StringBuilder sb = new StringBuilder();
	    for (char c : str.toCharArray())
	    sb.append((int)c);

	    BigInteger mInt = new BigInteger(sb.toString());
	    System.out.println(mInt);
		
	  
	}

}
