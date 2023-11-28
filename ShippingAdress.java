import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner Adress = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = Adress.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber = Adress.next();

        Adress.nextLine();

        System.out.println("Enter your Street name:");
        String StreetName = Adress.nextLine();

        System.out.println("Enter your city name:");
        String cityName = Adress.nextLine();

        System.out.println("Enter your state:");
        String state = Adress.nextLine();

        System.out.println("Enter your zipcode:");
        String zipCode = Adress.nextLine();


        System.out.println("Your shipping address is: ");
        System.out.println("\t" + fullName);
        System.out.println("\t" + buildingNumber + " " + StreetName);
        System.out.println("\t" + cityName + ", " + state + " " + zipCode);








/*
1. Create a class named ShippingAddress and ask the user to:
	        1.1 Enter your full name ( nextLine() )
	        1.2 Enter your building number ( next() )
	        1.3 Enter your Street name ( nextLine() )
	        1.4 Enter your city name ( nextLine() )
	        1.5 Enter your state ( nextLine() )
	        1.6 Enter your zipcode ( next() )

	        1.7 Display the shipping address
	                Ex:
	                    Your shipping address is:
	                        John Smith
	                        7925 Jones Branch Dr
	                        McLean, VA 22012

 */

    }
}
