public class Pro167_TwoSum_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                result[0] = left+1;
                result[1] = right+1;
                return result;

            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;


    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] res = (new Pro167_TwoSum_InputArrayIsSorted()).twoSum(nums, 9);
        System.out.println(res[0]);
        System.out.println(res[1]);


    }
}