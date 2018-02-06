public class Pro215_KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        return findKthRes(nums, nums.length-k , 0, nums.length-1);
    }

    public static int findKthRes(int[] nums, int k, int l, int r){
        int p = partition(nums, l, r);
        if(p == k){
            return nums[p];
        }else if(p > k){
          return  findKthRes(nums, k,l,p-1);
        }else {
           return findKthRes( nums,k, p+1,r);
        }
    }

    public static  int partition(int[] nums, int l ,int r){
        int j = l;
        int var = nums[l];
        for (int i =l+1 ; i<=r ; i++){
            if(nums[i] < var){
                j++;
                swap(nums,i,j);
            }
        }
        swap(nums,l,j);
        return j;
    }


    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args){
        int[] arr = { 4, 1, 5, 9, 10, 3, 12};
        int res = (new Pro215_KthLargestElementinanArray()).findKthLargest(arr,1);
        System.out.print(res);
    }
}
