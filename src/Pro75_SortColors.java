public class Pro75_SortColors {

    public  void sortColors(int[] nums) {
        int temp = 0;
        int zero = -1;
        int two = nums.length;
        for (int i =0; i< two;){
            if(nums[i] == 0){
                swap(nums,i,zero+1);

                i++;
                zero++;

            }else if(nums[i] == 1){
                i++;
            }else if(nums[i] == 2){

                swap(nums,i,two-1);
                two--;

            }
        }



    }


    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i]= nums[j];
        nums[j] = t;
    }

    public static void printArr(int[] nums){
        for(int num: nums)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args){
        int[] nums = {2, 2};
        (new Pro75_SortColors()).sortColors(nums);
        printArr(nums);
    }





}
