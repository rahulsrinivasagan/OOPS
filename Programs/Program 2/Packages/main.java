import convertor.*;
import java.util.Scanner;

class main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		convertor conv = new convertor();
		
		while(true){
			
			System.out.println("SELECT THE TYPE OF CONVERSION : ");
			System.out.println("");
			System.out.println("1.INR TO DOLLAR");
			System.out.println("2.DOLLAR TO INR");
			System.out.println("3.KM TO MILES");
			System.out.println("4.MILES TO KM");
			System.out.println("5.CELCIUS TO FAHRENHEIT");
			System.out.println("6.FAHRENHEIT TO CELCIUS");
			System.out.println("7.HOURS TO MIN");
			System.out.println("8.MIN TO HOURS");
			System.out.println("9.EXIT");
			
			int choice = scan.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("Converting INR to Dollar...");
					conv.InrToDollar();
					break;
				case 2:
					System.out.println("Converting Dollar to INR...");
					conv.DollarToInr();
					break;
				case 3:
					System.out.println("Converting KM to Miles...");
					conv.KmToMiles();
					break;
				case 4:
					System.out.println("Converting Miles to KM...");
					conv.MilesToKm();
					break;
				case 5:
					System.out.println("Converting Celcius to Fahrenheit...");
					conv.CelciusToFahrenheit();
					break;
				case 6:
					System.out.println("Converting Fahrenheit to Celcius...");
					conv.FahrenheitToCelcius();
					break;
				case 7:
					System.out.println("Converting Hours to Mins...");
					conv.HoursToMin();
					break;
				case 8:
					System.out.println("Converting Mins to Hours...");
					conv.MinToHours();
					break;
				case 9:
					System.out.println("Exiting the Program...");
					System.exit(0);
					break;
				default:
					System.out.println("INVALID CHOICE , PLEASE TRY AGAIN");
					break;
			}
		}
	}
}
			