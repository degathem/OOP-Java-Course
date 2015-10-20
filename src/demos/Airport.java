package demos;

//import module6.Airport;

/** A class to represent Airport data.
 * Used in module 6 of the UC San Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 *
 */
public class Airport {
	private int airportID;
	private String name;
	private String city;
	private String country;
	private String code3;
	private String code4;
	private double latitude;
	private double longitude;
	private int altitude;
	private float timezone;
	private char dst;
	private String dbTimezone;
	
	
	public Airport(int airportID, String name, String city, String country, String code3, String code4, double latitude,
			double longitude, int altitude, float timezone, char dst, String dbTimezone) {
		this.airportID = airportID;
		this.name = name;
		this.city = city;
		this.country = country;
		this.code3 = code3;
		this.code4 = code4;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.timezone = timezone;
		this.dst = dst;
		this.dbTimezone = dbTimezone;
	}
	public int getAirportID() {
		return airportID;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getCode3() {
		return code3;
	}
	public String getCode4() {
		return code4;
	}
	public double getLatitude() {
		return latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public int getAltitude() {
		return altitude;
	}
	public float getTimezone() {
		return timezone;
	}
	public char getDst() {
		return dst;
	}
	public String getDbTimezone() {
		return dbTimezone;
	}
	
	public static String linearSearch(String toFind, Airport[] airports) {
		int count = 0;
		while (count < airports.length) {
			if (toFind == airports[count].getCity()) {
				return airports[count].getCode3();
			}
			count = count + 1;
		}
		return "Airport not found";
	}
	
	public static String binarySearch(String toFind, Airport[] airports) {
		int high = airports.length;
		int low = 0;
		
		while (low <= high) {
			int mid = (high + low)/2;
			
			if (toFind.compareTo(airports[mid].getCity()) > 0) {
				low = mid - 1;
			} else if (toFind.compareTo(airports[mid].getCity()) < 0) {
				high = mid + 1;
			} else {
				return airports[mid].getCode3();
			}
		}
		return null;
	}
	
	public static Airport[] selectionSort(Airport[] airports) {
		
		//for (int i = 0; i < airports.length; i++) {}
		for (int i = 0; i < airports.length - 1; i++) {

			Airport lowestcandidate = airports[i];
			Airport currentairport = airports[i];
			int swapposition = i;
			for (int j = i + 1; j < airports.length; j++){
				int compareresult = lowestcandidate.getCity().compareTo(airports[j].getCity());
				if (compareresult < 0) {
					lowestcandidate = airports[j];
					swapposition = j;
				}
			}
			airports[i] = lowestcandidate;
			airports[swapposition] = currentairport;
		}
		return airports;
	}
	
}
