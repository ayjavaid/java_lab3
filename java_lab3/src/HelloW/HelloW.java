package HelloW;

//import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class HelloW {
	
//	static int a;

//	public static void testFunction(int b) {
//		System.out.println(b*2);
////		return b*2;
//	}
//	
//	public static void main(String[] args) {
//		int a = 6;
//		testFunction(a);
//		System.out.println(a);
//		
	
	
//	public static double testFunction(double b) { //method name overloading
//		System.out.println(b*2);
//		return b*2;
//	}
//	
	public static void testFunction(int[] test) {
////		int a  = scnr.nextInt();
		for(int i = 0; i < test.length; i++) {
			test[i] = test[i] * 2;
		}		
		/* return test; */
		
	}
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] b = {3,4,5,6,7,8};
		testFunction(b);
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
//		System.out.println(testFunction(b));
		
//		int a = 6, b = 8, c;
//		int[] arr = new int[8];
//		Random my_random = new Random();
//		//a = my_random.nextInt(20);
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = my_random.nextInt(100);
//			System.out.println(arr[i]);
//		}
////		max = arr[0];
//		for (int i = 0; i < arr.length-1; i++) {
//			if ((arr[i]>arr[i+1])) {
//				c = arr[i+1];
//				arr[i+1] = arr[i];
//				arr[i] = c;
//			}
//				
//		}
//		System.out.println("");
//		
//		
//		for (int i = 0; i < arr.length; i++) {
////			arr[i] = my_random.nextInt(100);
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("Max is " + arr[(arr.length - 1)]);
//		
		
//		double[] brr = {0.1,0.2,0.3,0.4};
//		double d;
//		Scanner scnr = new Scanner(System.in);
//		str = scnr.next().;
//		for (int i = 0 ;i < arr.length;i++) {
//			arr[i] *= 2;
//			System.out.println(arr[i]);
//		}
		
			
//		temp = LightState.RED;
		
//		for (int i = 0; i < 10; i++) {
//			
//			System.out.println("This is the test number " + i);
//			if (i == 5)
//				continue;
//			if (i == 7)
//				break;
//			System.out.println("This is not a basic test\n");
//		}
//		
		
		
		
		
//		while (a <= 'z') {
//			while (b <= 'z') {
//				System.out.println(a + "" + b + ".com");
//				b++;
//			}
//			a++;
//			System.out.println(a + "" + b);
//			b = 'a';
//		}
					
//		do {
//			System.out.println(a%10);
//			a = a/10;
//			System.out.println(a);
//		} while (a!=0);

		//d = scnr.nextDouble();
//		a = 5;
//		b = 3;
//		if ((a > 4) || (b > 2))
//			System.out.println("Works!");
		//System.out.println("THis is the end of the program!");
		
//		switch(c) {
//		case 'A':
//			System.out.println("Case 0");
//			break;
//		case 'B':
//			System.out.println("Case 1");
//			break;
//		case 'C':
//			System.out.println("Case 2");
//			break;
//		default:
//			System.out.println("Default case");
//		}
		
//		System.out.println(12 | 10);
		// Conditional structure to calculate the insurance based on age
//		if (age > 40) {
//			System.out.println("Insurance is 250");
//			System.out.println("This is a test for braces 1");
//		}		
//		else if (age > 25) {
//			System.out.println("Insurance is 300");
//		}
//		else if (age < 23 && age >= 21) {
//			System.out.println("can't drink and drive");
//		}
//		else if (age > 16) {
//			System.out.println("Insurance is 200");
//		}
//		else {
//			System.out.println("Not allowed to drive.");
//			System.out.println("This is a test for braces 2");
//		}
		
//		Random my_random = new Random();
//		a = my_random.nextInt(20); // 0 - 19
//		b = my_random.nextInt(30)+30; // 30 - 59
//		if ((a > 10) && (a < 45)) {
//			System.out.println("a = " + a + " b = " + b +  " Success!!");
//		}
//		else if ((a <= 25) || (b > 37)) {
//			System.out.println("a = " + a + " b = " + b + " Partial Success!!");
//		}
//		else {
//			System.out.println("a = " + a + " b = " + b +  " Failure!!");
//		}
		
//		scnr.close();
	}

}
