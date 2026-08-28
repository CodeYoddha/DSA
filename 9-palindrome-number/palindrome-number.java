class Solution {
    public boolean isPalindrome(int x) {
        //Negative Numbers are not Palindrome numbers
        if(x<0){
            return false;
        }
        //Variable to store the Reversed Number
        int revNum = 0;
        //Store the original number because x will be modified
        int dup = x;
        while(x>0){
            //Get the last digit
            int lastDigit = x%10;
            //Build the reversed number
            revNum = (revNum*10)+lastDigit;
            //Remove the last Digit
            x = x/10;
        }
        //Compare original and Reversed Number
        return dup==revNum;
    }
}