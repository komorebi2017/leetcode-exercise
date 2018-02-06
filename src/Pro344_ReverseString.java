public class Pro344_ReverseString {

    public String reverseString(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length-1;
        while (left < right){
            swap(str, left, right);
            left++;
            right--;
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
        String str = "hello";
        String result = (new Pro344_ReverseString()).reverseString(str);
        System.out.println(result);
    }


}
