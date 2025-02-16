class Solution {
    public int[] numberGame(int[] nums) {
        int arr [] = new int [nums.length];
        int temp = 0;
        for(int i = 0 ; i < nums.length; i++){
            for(int j = i +1 ; j < nums.length; j++){
                if(nums[i]> nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;            
            }
            }
        }
        int tem = 0;
        for(int i = 0; i< nums.length; i++){
           
                if(i %2==0 ){
                 arr[tem]=nums[i+1];
                 arr[tem+1]=nums[i];
                tem=tem+2;
                }
                
            
        }
        
        
        return arr;
    }
}