
public class practice2 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 13 ;
        int res = targetVal(arr, target);
        System.out.println(res);
    }

    static int targetVal(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start < arr.length ? start : -1;
    }
}
