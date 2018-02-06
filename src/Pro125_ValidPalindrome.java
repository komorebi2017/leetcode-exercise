public class Pro125_ValidPalindrome {

    public boolean isPalindrome(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length -1;
        while (left < right){

            while (str[left] < 48 || (str[left]>57 && str[left]<65) ||(str[left]>90 && str[left]<97) ||str[left]>122){
                left++;
                if(left == right){
                    return true;
                }
            }
            while (str[right] < 48 || (str[right]>57 && str[right]<65) ||(str[right]>90 && str[right]<97) ||str[right]>122){
                right--;
            }
            if(str[left]>47 &&str[left]<58){
                if (str[left]!= str[right]){
                    return false;
                }
            }else if(str[left]>64 &&str[left]<91){
                if(str[left]!= str[right] && str[left]!= str[right]-32){
                    return false;
                }
            }else {
                if(str[left]!= str[right] && str[left]!= str[right]+32){
                    return false;
                }
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String str = ".,";
        boolean res = (new Pro125_ValidPalindrome()).isPalindrome(str);
        System.out.println(res);



    }




}
