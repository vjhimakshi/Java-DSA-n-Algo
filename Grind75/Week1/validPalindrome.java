package Grind75.Week1;

public class validPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(Character.toLowerCase(s.charAt(left)) !=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
