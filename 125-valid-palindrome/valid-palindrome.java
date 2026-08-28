class Solution {
    public boolean isPalindrome(String s) {
        //two pointers one starts from beginning and the other from end
       int left=0, right=s.length()-1;
       while(left<right){
            //if left pointer is not letter or digit, skip it and move left pointer forward
            if(!Character.isLetterOrDigit(s.charAt(left))){
            left++;
            }
            //if right pointer is not letter or digit, skip it and move right pointer backward
            else if(!Character.isLetterOrDigit(s.charAt(right))){
            right--;
            }
            //Convert both characters to lowercase and compare them, if they are different the string is not palindrome
            else if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            return false;
            }
            //if both characters match move pointers inwards
            else{
            left++;
            right--;
            }
        }
        //if no mismatch was found, the string is palindrome
        return true;
    }
}