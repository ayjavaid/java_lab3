package HelloW;

public class HelloW {
	
	public static void main (String args[]) {
		System.out.println("Hello World\n This is an example.");

//		int i = 5; 		// i is assigned a value of 5
//		int j = ++i;	// j is being assigned the value of i after the increment
//		// increment will execute first and the assignment operations will occur next
//		int k = i++;	// k is being assigned the current value of i (=6) and after the assignment
//		//operation is executed, the value of i is incremented again (=7)
		
		
		int i = 5; 		// i = 5
		int k = i--;	// k = 5, i = 4
		int j = --i;	// i = 3, j = 3 
		
		
		System.out.println("Values: " + i + " " + j + " " + k);
	}
}