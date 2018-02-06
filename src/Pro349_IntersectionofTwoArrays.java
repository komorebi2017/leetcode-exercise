import java.util.TreeSet;

public class Pro349_IntersectionofTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {


        TreeSet<Integer> record = new TreeSet<Integer>();
        for (int num: nums1){
            record.add(num);
        }

        TreeSet<Integer> result = new TreeSet<Integer>();
        for (int num:nums2){
            if(record.contains(num)){
                result.add(num);
            }
        }

        int[] res = new int[result.size()];
        int count = 0;
        for (Integer num: result){
            System.out.print(num+" ");
            res[count++] = num;
        }

        return res;

    }


    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2, 1};
        int[] res = (new Pro349_IntersectionofTwoArrays()).intersection(nums1, nums2);
    }

}
