class Solution {
    public int addDigits(int num) {
        if(num == 0) return 0;
        int last = 0;
        if(num > 0){
            last = getSum(num);
            while(last > 9){
                last = getSum(last);
            }
        }
        return last;
    }
    private int getSum(int num){
            int sum = 0;
            while(num > 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
            }
            return sum;
        }
}