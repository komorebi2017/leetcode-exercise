public class Pro283_MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int nonZero = 0;
        int cur = 0;
        int temp = -1;
       while (cur < nums.length){

            if( nums[cur] !=0 ){
                temp=nums[cur];
                nums[cur] =nums [nonZero];
                nums [nonZero]=temp;
                nonZero ++;
                cur ++;
            }else {
                cur ++;
            }
        }

        for(int i = 0; i< nums.length; i++){
          System.out.println(nums[i]);
        }


    }



    public static void main(String[] args){
        int[] arr = { 0, 1, 0, 3, 12};
        moveZeroes(arr);
    }

}
