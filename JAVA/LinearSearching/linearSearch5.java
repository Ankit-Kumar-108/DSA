public class linearSearch5 {
    public static void main(String[] args) {
        int [] nums = {23, 345, 34634, 45 ,2121};
        int res = noEven(nums);
        System.out.println(res);
    }
        
    static int noEven(int [] nums){
        int digits = 0;
        for(int i = 0; i < nums.length; i++){
            int count = String.valueOf(nums[i]).length();
            if(count % 2 == 0){
               digits++;
            }
        }
        return digits;
    }
    
}
