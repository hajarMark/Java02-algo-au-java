package Candies;

public class CandyCount {

	public static void main(String[] args) {
		double money;
		double price;
		int candies;
		money=12.4; 
		price=1.2; 
		candies=0;
		if (money > 0 & price > 0) {
			while((money - price) >= 0) {
				candies=candies + 1;
		        money=money - price;
				}
			}
		System.out.println(candies); 	
	}

}



