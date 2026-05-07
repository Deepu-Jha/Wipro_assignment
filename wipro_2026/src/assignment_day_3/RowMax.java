package assignment_day_3;

public class RowMax {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 7, 3, 9},
            {4, 2, 8, 5},
            {6, 0, 11, 3}
        };

        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }

            System.out.println("Row " + (i + 1) + " max: " + max);
        }
    }
}
