class Solution {
    public int[] sortedSquares(int[] nums) {
        
        // for( int i = 0 ; i < nums.length; i++){
        //     nums[i] = nums[i] * nums[i];
        // }
        // for(int i = 0 ; i < nums.length; i++){
        //    for(int j = i ; j < nums.length; j++){
        //     if(nums[i] > nums[j]){
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //     }
        //    }
        // }
        // Arrays.sort(nums);
        // return nums;


        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }
}