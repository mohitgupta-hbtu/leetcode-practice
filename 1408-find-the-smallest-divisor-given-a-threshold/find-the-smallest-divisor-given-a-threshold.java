class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low =1 , high = Arrays.stream(nums).max().getAsInt() , ans = high;
        while(low<= high){
            long count =  0;
            int mid = low + (high - low)/2;
            for(int i = 0 ; i < nums.length ; i++){
                count+= (nums[i] + mid - 1)/mid;
                if(count > threshold){
                    break;
                }
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