public class Pro209_MinimumSizeSubarraySum
{

    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length== 0){
            return 0;
        }
        int left = 0;
        int right = 1;
        int minLength = nums.length+1;
        int sum = nums[0];
        if(nums[0]>= s){
            return 1;
        }
        while (right<nums.length && left<=right){
            System.out.println("r:"+right);
            if(nums[right]+sum >= s){
              // System.out.println(nums[right]+sum);
                minLength = Math.min(minLength,right-left+1);
                sum-=nums[left];
                left++;
            }else{
                sum += nums[right];
                right++;
            }

        }
        return minLength==nums.length+1?0:minLength;
    }


    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println((new Pro209_MinimumSizeSubarraySum()).minSubArrayLen(3,nums));



    }


}
