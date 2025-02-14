class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int original = x;
        while(x > 0 ){
            int temp = x % 10 ;
            reversed = reversed * 10 + temp;
            x = x / 10;
        }
        return (reversed == original ) ? true : false;
    }
}