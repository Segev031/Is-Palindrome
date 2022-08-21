class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        if (x < 0) 
            return false;
        int num = x;
        while (num != 0) {
            reverse = reverse * 10 + num % 10; 
            num /= 10;
        }
        return x == reverse;
    }
}