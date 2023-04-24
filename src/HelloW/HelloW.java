package HelloW;

import java.util.Random;

public class HelloW {
	
	public static void main (String args[]) {
		System.out.println("Hello World\n This is an example.");
		System.out.println(~12);
		System.out.println((10 > 2) & (8 < 4));
		Random rn = new Random();
		//for (int i=0;i<50;i++ ) {
			int randomNum = rn.nextInt(50) +50;
			System.out.println(randomNum);
			   String s="Sachin"; 
			   String n = "Tend";
			   s.concat(" Tendulkar");//concat() method appends the string at the end  
			   System.out.println(s.replace("in",n));
			   System.out.println(s);//will print Sachin because strings are immutable objects  	
		//}
		
	}
}

