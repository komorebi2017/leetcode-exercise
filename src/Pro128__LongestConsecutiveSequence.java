import java.util.HashMap;

public class Pro128__LongestConsecutiveSequence {

    /*128.最长的连续序列
    * 给定一个未排序的整数数组，找到最长的连续元素序列的长度。

        例如，
        给定[100, 4, 200, 1, 3, 2]，
        最长的连续元素序列是[1, 2, 3, 4]。返回它的长度：4。

        你的算法应该以O（n）的复杂度运行。*/

    public static  int longestConsecutive(int[] nums) {
        if(nums == null||nums.length ==0){
            return  0;
        }
        int max = 1;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i =0; i<nums.length; i++){
            /*之前没出现过nums[i]*/
            if(!map.containsKey(nums[i])){
                /*首先单独作为一个序列*/
                map.put(nums[i],1);
                /*判断是否含有nums[i]-1*/
                if(map.containsKey(nums[i]-1)){
                    /*有的话就合并*/
                    max = Math.max(max,merge(map,nums[i]-1, nums[i]));

                }
                if(map.containsKey(nums[i]+1)){
                    max = Math.max(max,merge(map, nums[i],nums[i]+1));

                }
            }
        }
        return max;
    }


    public static  int merge(HashMap<Integer,Integer> map, int less, int more){
        int left = less-map.get(less)+1;
        int right = more+map.get(more)-1;
        int len = right - left +1;
        map.put(left,len);
        map.put(right,len);
        return len;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(arr));

    }


}
