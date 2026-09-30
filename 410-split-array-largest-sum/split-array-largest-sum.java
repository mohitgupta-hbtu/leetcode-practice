class Solution {
    public int splitArray(int[] nums, int k) {
        int high = 0,low = Arrays.stream(nums).max().getAsInt() , ans = low ;
        for(int i  = 0 ; i < nums.length; i++){
            high+=nums[i];
        }
        while(low<=high){
            int mid = low + (high - low)/2;
            if(SumPossible(nums , mid) < k){
                high = mid -1;
            }
            else{
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
    public int SumPossible(int nums[] , int num){
        int j = 0 , sum= 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(sum+ nums[i] >= num){
                j++;
                sum = nums[i];
            }
            else{
                sum+=nums[i];
            }
        }
        return j;
    }
}