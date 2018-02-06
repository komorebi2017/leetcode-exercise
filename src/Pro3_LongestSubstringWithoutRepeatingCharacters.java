public class Pro3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int freq[] = new int[256];
        char[] str = s.toCharArray();
        int left = 0;
        /*让r=-1，初始时就不存在窗口，也能保证判断的正确执行，需记住*/
        int right = -1;
        int maxLength = 0;

        while (right + 1 < str.length){

            if(freq[str[right+1]]==0){
                freq[str[right+1]]++;
                right++;
                maxLength = Math.max(maxLength,right-left+1);
            }else {
                freq[str[left]]--;
                left++;
            }

        }
        return maxLength;
    }


    public static void main(String[] args) {
        String s = "";
        System.out.println(
                (new Pro3_LongestSubstringWithoutRepeatingCharacters())
                        .lengthOfLongestSubstring(s));



    }





}
