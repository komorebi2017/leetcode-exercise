import java.util.TreeMap;

public class Pro350_IntersectionofTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {

        int[] a = {0,0};
        TreeMap<Integer,Integer> record = new TreeMap<Integer,Integer>();
        for(int num : nums1){
            if(record.containsKey(num)){
                record.put(num, record.get(num)+1);
            }else {
                record.put(num , 1);
            }


        }

        return a;
    }
}
