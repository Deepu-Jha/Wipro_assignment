package wipro_training_day_2;

public class employee_salary_increment_system {

	public static void main(String[] args) {
		double salary[] ={25000, 30000, 27000};
		for(int i=0; i < salary.length; i++){
			salary[i] = salary[i]*1.60;// TODO Auto-generated method stub
		}
		for(int i=0;i < salary.length;i++) {
			System.out.println("Employee : " + salary[i]);
		}

	}

}
