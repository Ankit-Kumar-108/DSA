


public class practice{
    public static int main(String[] args) {
      // int [] arr1 = new int[5];
      // arr1[0] = 6;
      // arr1[1] = 7;
      // arr1[2] = 8;
      // arr1[3] = 9;
      // arr1[4] = 10;

      // int[] arr2 = {1,2,3,4,5};

      // System.out.println("array 1"+ Arrays.toString(arr1) + "array 2"+ Arrays.toString(arr2));
      // 2n array of array
      // int [] arr = new int [5];
      // System.out.println("Enter array of 5 length");
      // Scanner in = new Scanner(System.in);
      // for (int i = 0;i<arr.length;i++){
      //   arr[i] = in.nextInt();
      // }
      // int count = 0;
      // int [] arr1 = new int[2*arr.length];
      // for(int j = 0; j<arr1.length;j++){
      //   if(count == arr.length){
      //     count =0;
      //   }
      //   arr1[j] = arr[count];
      //   count++;
      // }
      // System.out.print(Arrays.toString(arr1));
      int n = 234;
       int count = String.valueOf(n).length();
        int sum = 0;
        int product = 1;
        for (int i = 0; i<count; i++){
            int digit = n%10;
            sum =+ digit;
            product = (product*10)+ digit;
        }
        return product - sum;
    }
}
