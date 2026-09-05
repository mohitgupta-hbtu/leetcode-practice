class Solution {
    public int findMin(int[] nums) {
        int ans = nums[nums.length - 1] , low = 0 , high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if((nums[low] == nums[mid] && nums[mid] == nums[high]) && (low!= mid && mid!=high)) {
                low = low+1;
                high = high - 1;
                continue;
            }
            if(nums[mid] <= nums[high]){
                if(ans > nums[mid]){
                    ans = nums[mid];
                }
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            
        }
        return ans;
    }
}