package assignment_day_2;

public class vowel_or_consonant_using_switch_case {

	public static void main(String[] args) {
        char ch = 'a';
        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }// TODO Auto-generated method stub

	}

}
