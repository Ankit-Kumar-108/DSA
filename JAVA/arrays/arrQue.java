
import java.util.Arrays;

public class arrQue {
    public static void main(String[] args) {
        int[] arr = {1, 4, 66, 876, 43, 534, 5};

        Swap(arr, 2, 5);

        System.out.println(Arrays.toString(arr));
        System.out.println("Max "+ Max(arr));

    }
    static void Swap(int [] arr , int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr [index2] = temp;
    };

    static int Max(int[] arr) {
        int MaxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> MaxVal){
                MaxVal = arr[i];
            }
        }
        return MaxVal;
    };
}
