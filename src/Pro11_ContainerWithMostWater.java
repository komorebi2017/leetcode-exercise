public class Pro11_ContainerWithMostWater {


    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;
        int res = 0;
        int cur = 0;
        while (left < right){

            if(height[left] > height[right]){
                cur = (right - left)* height[right];
                right--;
            }else {
                cur = (right - left)* height[left];
                left++;
            }
            res = Math.max(res,cur);

        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,18,17,6};
        System.out.println(new Pro11_ContainerWithMostWater().maxArea(arr));
    }
}
