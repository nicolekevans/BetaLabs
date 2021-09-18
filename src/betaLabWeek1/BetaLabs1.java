package betaLabWeek1;

public class BetaLabs1 {

	public static void main(String[] args) {
		int planeSeatsLeft = 5;
		double groceryCost = 3.47;
		char middleInitial = 'h';
		boolean hotOutside = true;
		String firstName = "Nicole";
		String streetAddress = "101 NW Street";
		
		System.out.println (planeSeatsLeft);
		System.out.println (groceryCost);
		System.out.println (middleInitial);
		System.out.println (hotOutside);
		System.out.println (firstName);
		System.out.println (streetAddress);
		
		planeSeatsLeft = planeSeatsLeft - 2;
		groceryCost = groceryCost + 2.15;
		middleInitial = 'B';
		hotOutside = false;
		String fullName = (firstName + " " + middleInitial+ " " + "Johnson");
		System.out.println("This is " + fullName + ". He lives at " + streetAddress);
		
		System.out.println (planeSeatsLeft);
		System.out.println (groceryCost);
		System.out.println (middleInitial);
		System.out.println (hotOutside);
		System.out.println (firstName);
		System.out.println (streetAddress);
		
		
	

	}

}
