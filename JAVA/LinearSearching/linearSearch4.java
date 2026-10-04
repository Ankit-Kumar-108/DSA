
import java.util.Arrays;

public class linearSearch4 {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 7, 9},
            {11, 75, 8, 6},
            {-2, 63, -11},
            {354, -54, 33, 86},
        };

        int target = 75; 
        int[] result = tragetValue(arr, target);
        System.out.println("Target At : " + Arrays.toString(result));

        int maxRes = maxValue(arr);
        System.out.println("Max Value At : " + maxRes);
    }

    static int[] tragetValue(int [][] arr, int targrt) {
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == targrt)
                return new int[] {row, col};
            }
        }
        return new int [] {-1, -1} ;
    }

    static int maxValue(int[][] arr){
        int max = arr[0][0];
        for (int[] arr1 : arr) {
            for (int col : arr1) {
                if (col > max) {
                    max = col;
                }
            }
        }
        return max;
    }
}
