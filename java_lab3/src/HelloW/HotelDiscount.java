package HelloW;

import java.util.Scanner;

public class HotelDiscount {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int hotelRate;
      int userAge;

      hotelRate = 155;

      System.out.print("Enter age: ");
      userAge = scnr.nextInt();

//      if (userAge > 65) {
//         hotelRate = hotelRate - 40;
//      }
//      else if (userAge > 55) {
//          hotelRate = hotelRate - 30;
//      }
//      else if (userAge > 45) {
//          hotelRate = hotelRate - 20;
//      } 
//      
      
       if (userAge >= 45 & userAge < 55) {
           hotelRate = hotelRate - 20;
       }
       else if (userAge >= 55 & userAge < 65) {
           hotelRate = hotelRate - 30;
       }
       else if (userAge > 65) {
    	   hotelRate = hotelRate - 40;
       }
       
      System.out.print("Your hotel rate: ");
      System.out.println(hotelRate);
   }
}

//65 40
//[55-65) 30
//[45-55) 20
//45 no discount