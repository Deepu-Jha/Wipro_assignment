package wipro_training_day_2;

public class online_shopping_discount_system {

	public static void main(String[] args) {
		double purchase_amount = 2800;
		double discount = 0;
		double amount;
		if(purchase_amount > 2000){
			discount = purchase_amount * 0.20;// TODO Auto-generated method stub
		}else if(purchase_amount>1000) {
			discount = purchase_amount * 0.10;
		}
		else {
			discount = 0;
		}
        amount = purchase_amount - discount;
        System.out.println("Discount : " + discount);
        System.out.println("Amount : " + amount);
	}

}
