package convertor;
import java.util.Scanner;

public class convertor{
	
	Scanner scan = new Scanner(System.in);
	
	public void InrToDollar(){
		System.out.println("Enter the Amount in INR : ");
		double inr = scan.nextDouble();
		double dollar = inr/82.73;
		System.out.println("The Amount in DOLLAR : "+dollar);
	}
	
	public void DollarToInr(){
		System.out.println("Enter the Amount in DOLLAR : ");
		double dollar = scan.nextDouble();
		double inr = dollar*82.73;
		System.out.println("The Amount in INR : "+inr);
	}
	
	public void KmToMiles(){
		System.out.println("Enter the Distance in KM : ");
		double km = scan.nextDouble();
		double miles = km/1.60793;
		System.out.println("The Distance in MILES : "+miles);
	}
	
	public void MilesToKm(){
		System.out.println("Enter the distance in MILES : ");
		double miles = scan.nextDouble();
		double km = miles*1.60793;
		System.out.println("The Distance in KM : "+km);
	}
	
	public void CelciusToFahrenheit(){
		System.out.println("Enter the Temperature in Celcius : ");
		double celcius = scan.nextDouble();
		double fahrenheit = (celcius * 9/5) + 32;
		System.out.println("The Temperature in FAHRENHEIT : "+fahrenheit);
	}
	
	public void FahrenheitToCelcius(){
		System.out.println("Enter the temperature in Fahrenheit : ");
		double fahrenheit = scan.nextDouble();
		double celcius = (fahrenheit - 32) * 5/9;
		System.out.println("The Temperature in CELCIUS : "+celcius);
	}
	
	public void HoursToMin(){
		System.out.println("Enter the Time in HOURS : ");
		double hour = scan.nextDouble();
		double min = hour*60 ;
		System.out.println("The Time in MINS : "+min);
	}
	
	public void MinToHours(){
		System.out.println("Enter the Time in MINS : ");
		double min = scan.nextDouble();
		double hour = min/60;
		System.out.println("The Time in HOURS : "+hour);
	}
}
