package assignment_day_3;
import java.util.Arrays;
public class sort_an_array_in_asscending_or_descending {
	

	    public static void main(String[] args) {
	        int[] arr = {4, 2, 9, 3, 7, 6};

	       
	        Arrays.sort(arr);
	        System.out.println("Ascending: " + Arrays.toString(arr));

	        
	        System.out.print("Descending: ");
	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");}
	}
}
