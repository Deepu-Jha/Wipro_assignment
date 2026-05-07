package wipro_training_day_2;

public class student_grade_classification {

	public static void main(String[] args) {
		int marks = 97;// TODO Auto-generated method stub
		char grade;
		
		if(marks>=90) {
			grade='A';
			
		}
		else if (marks>=70) {
			grade='B';
		}
		else {
			grade='F';
		}
		System.out.println("Marks : " + marks);
		System.out.println("Grade : " + grade);
		
	}

}
