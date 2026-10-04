public class linearSearch3 {
    public static void main(String[] args) {
         int[] arr = {18, 12, -7, 3, 14, 28};
         int result = min(arr);
         System.out.println(result);
    }

    static int min(int[] arr) {
    //    assume arr is non empty
        int val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < val){
               val = arr[i];
            }
        }
        return val;
    }
}
