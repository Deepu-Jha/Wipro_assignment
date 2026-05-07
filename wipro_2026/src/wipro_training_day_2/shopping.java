package wipro_training_day_2;

public class shopping {
	public static void main(String[] args) {
		double prices [] = {60, 38, 73, 86};
		double total = 0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]==0) {
				break;
			}
			total+=prices[i];
		}
		System.out.println("Total amount: "+ total);
	}

}
