package assignment4_3;
import java.util.Scanner;

/**
 * Final class to set speed limits and other rules which can't be overwritten 
 *
 */
final class TrafficRule {
	
	TrafficRule() { // final constructor to print to speed limits set by Govt 
		System.out.println("Traffic rule is you shouldnt exceed 90 Km/hr in Highway and 50km/hr in City"); // Print message
	}
	
	int  highwaySpeedLimit = 90; // final variable highway speed limit can't be overwritten
	int  citySpeedLimit=50;	//  final variable city speed limit can't be overwritten
	
	
}


/**
 * class to calculate fine set by State Govt for violating traffic rule
 *
 */
class TrafficViolatorsFineCalculator {
	
	TrafficRule n= new TrafficRule(); // Creating object for Traffic rule to access speedlimits
	
	TrafficViolatorsFineCalculator() { // Constructor to print speed limit exceeded 
		System.out.println("Fine calculator.."); // print message
	}
	
	final static int highWayFine=500;	// Final variable to set fine on highway
	final static int cityFine=200;		// Final variable to set fine in city
	

	/**
	 * @param highwaySpeed
	 * 
	 * Show the fine for crossing Highway speed limit
	 */
	final void HighWayFineForSpeedViolation(int highwaySpeed) { // Fine method by Govt can't be overwritten
		
		if (highwaySpeed > n.highwaySpeedLimit) // See if speed has crossed highway limit
			System.out.println("Speed limt crossed in Highway , Pay fine Rs."+highWayFine); // Printing fine for exceeding highway speed
		else 
			System.out.println("Speed is within the highway limits of "+n.highwaySpeedLimit+" Km/hr, NO FINE"); // Printing speed is with limits
	}
	
	/**
	 * @param citySpeed
	 * Show the fine for crossing city speed limit
	 */
	final void CityFineForSpeedViolation(int citySpeed) { // Fine method by Govt can't be overwritten
		
		if (citySpeed > n.citySpeedLimit) // See if speed has crossed city limit
			System.out.println("Speed limt crossed in City , Pay fine Rs."+cityFine);	// Printing fine for exceeding highway speed
		else 
			System.out.println("Speed is within the highway limits of "+n.citySpeedLimit+" Km/hr, NO FINE");  // Printing speed is with limits
	}
	
}


/**
 * Class to calculate fine as per Govt rules , if the vehicle as violated speed limit inside city limit
 *
 */
public class Assignment4_3 {
	public static void main (String args []) {// main method start
		
		Scanner mScanner= new Scanner(System.in); 	// Creating scanner object for taking input
		TrafficViolatorsFineCalculator mCalculator = new TrafficViolatorsFineCalculator(); // Creating new object for calculating fine for crossing speed limit
		
		System.out.println("Enter city speed of the vehicle"); // Print message to take input
		mCalculator.CityFineForSpeedViolation(mScanner.nextInt()); // Printing for crossing speed
		mScanner.close(); // Closing scanner object
		
	}
}// class closed
