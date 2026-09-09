class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low =0 , high = Arrays.stream(nums).max().getAsInt() , ans = high;
        while(low<= high){
            int count =  0;
            int mid = low + (high - low)/2;
            for(int i = 0 ; i < nums.length ; i++){
                count+=Math.ceil((double) nums[i]/mid);
            }
            if(count <= threshold){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }

        }
        return ans;
    }
}