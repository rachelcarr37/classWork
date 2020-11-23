import java.util.*;
public class carDealer {
	public static void main(String[] args) {
		
		Map<String,String> carDealership = new HashMap<String,String>();
		carDealership.put("Outback","Subaru");
		carDealership.put("Camrey","Toyota");
		carDealership.put("Explorer","Ford");
		carDealership.put("A8","Audi");
	

		Scanner scan = new Scanner(System.in);
		System.out.print("What make of car would you like?");
		String car = scan.next();
		if (carDealership.containsKey(car)) {
			System.out.println("Of course! Our" + carDealership.get(car) + "is right over there!");
		} else {
			System.out.println("Sorry, we don't have that.");
		}
	}
}
