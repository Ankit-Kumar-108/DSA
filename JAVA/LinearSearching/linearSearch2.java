public class linearSearch2 {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int[] range = {1, 4};
        int target = 20;

        int result = targrtElement(arr, range, target);
        System.out.println(result);
    }

    static int targrtElement(int[] arr, int[] range, int target) {
        if (arr.length == 0){
            return -1;
        }

        for(int i = range[0]; i < range[1]; i++){
            int value = arr[i];
            if(value == target){
                return i;
            }
        }
        return -1;
    }
}
