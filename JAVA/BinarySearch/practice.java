public class practice {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 5, 6, 7, 8, 10, 23, 34, 77};
        int target = 10;

        int result = binarySearcyh(arr, target);
        System.out.println(result);
    };

    static int  binarySearcyh(int[] arr, int target ) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) { 
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end =  mid - 1;
            } else if (arr[mid] < target){
                start =  mid + 1;
            } else {
                return mid;
            }
        }
        return -1; 
    }
}
