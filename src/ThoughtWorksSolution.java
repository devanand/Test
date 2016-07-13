import java.util.Scanner;

public class ThoughtWorksSolution {

	static void solution() {
		Scanner s = new Scanner(System.in);
		int totalShares = 0;
		double profit = 0;
		String type = null;
		String isContinue ="y";
		double moneySpent = 0;
		double moneyearned = 0; 
		do {
			System.out.print("Enter transaction type:");
			type = s.nextLine();
			while(!type.equalsIgnoreCase("Sell")  &&!type.equalsIgnoreCase("buy")) {
				System.out.println("You can either buy or sell");
				type = s.nextLine();
			}
			while(type.equalsIgnoreCase("sell") && totalShares == 0) {
				System.out.println("Invalid option: You cannot sell shares when you have none. Buy some first");
				type = s.nextLine();
			}
			System.out.print("Enter number of shares:");
			String tempNoShares = s.nextLine();
			int numberOfShares = 0;
			while(type.equalsIgnoreCase("buy") && tempNoShares.equalsIgnoreCase("ALL")) {
				System.out.println("Invalid option: you cannot buy all shares");
				tempNoShares =s.nextLine();
			}
			if(type.equalsIgnoreCase("sell") &&tempNoShares.equalsIgnoreCase("ALL") && totalShares>0) {
				numberOfShares = totalShares;
			} else {
				
				while(type.equalsIgnoreCase("sell") && numberOfShares > totalShares) {
					System.out.println("Invalid option: enter a number that you hold");
					tempNoShares =s.nextLine();
					
				}
				numberOfShares = Integer.parseInt(tempNoShares);
			}
			
			System.out.print("Enter price per share");
			double pricePerShare = Double.parseDouble(s.nextLine());
			
			if(type.equalsIgnoreCase("sell")) {
				profit += pricePerShare * numberOfShares;
				totalShares -= numberOfShares;
			} else {
				profit -= pricePerShare * numberOfShares;
				totalShares += numberOfShares;
			}
			
			System.out.print("Continue");
			isContinue = s.nextLine();
		}while(isContinue.equalsIgnoreCase("y"));
		System.out.println(profit>=0?"You have made a profit of"+profit:"You have made a loss of "+profit);
	}
	
	public static void main(String[] args) {
		solution();
	}
}
