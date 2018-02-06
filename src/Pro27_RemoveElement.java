public class Pro27_RemoveElement {
/*有错误，不知道怎么把元素删除*/

    public  static int removeElement(int[] nums, int val) {
        int sumLength = nums.length;
        int nonEqual = 0;
        int cur = 0;
        int temp = -1;
        while (cur < nums.length){

            if( nums[cur] != val ){
                temp=nums[cur];
                nums[cur] =nums [nonEqual];
                nums [nonEqual]=temp;
                nonEqual ++;
                cur ++;

                sumLength --;
            }else {
                cur ++;
            }
        }


      /*  for(int i = 0; i< nums.length; i++){
            System.out.println(nums[i]);
        }*/

        return sumLength;

    }


    public static void main(String[] args){
        int[] arr = { 3,2,2,3};
        System.out.println(removeElement(arr, 3));
    }

}
