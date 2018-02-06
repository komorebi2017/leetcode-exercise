public class Pro53_MaximumSubarray {

    public static  int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = nums[0];
        for(int i = 0; i< nums.length;i++){
            sum = sum + nums[i];
            if(sum > ans){
             ans = sum;
            }
             if(sum < 0){
                 sum = 0;
            }

        }
        return ans;

    }


    public static void main(String[] args) {

       // int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr = {-1};
        System.out.println(maxSubArray(arr));

    }

}
