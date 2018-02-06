public class Pro345_ReverseVowelsofaString {

    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length-1;
        while (left <=right){
            boolean leftFlag = str[left]==65 || str[left]==69 || str[left]== 73 ||str[left]==79 || str[left]== 85
                    || str[left]==97 || str[left] ==101 || str[left]==105 || str[left]==111 ||str[left]==117 ;
            boolean rightFlag = str[right]==65 || str[right]==69 || str[right]== 73 ||str[right]==79 || str[right]== 85
                    || str[right]==97 || str[right] ==101 || str[right]==105 || str[right]==111 ||str[right]==117 ;
            if(leftFlag && rightFlag){
               swap(str,left++,right--);
            }else if(!leftFlag && rightFlag){
                left++;
            }else if(!rightFlag && leftFlag){
                right--;
            }else {
                left++;
                right--;
            }
        }
        String res = new String(str);
        return res;
    }


    private static void swap(char[]s, int  a, int b){
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }

    public static void main(String[] args) {
        String str = "leetcode";
        String result = (new Pro345_ReverseVowelsofaString()).reverseVowels(str);
        System.out.println(result);
    }



}
