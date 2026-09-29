class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low =Arrays.stream(weights).max().getAsInt() ,high = (Arrays.stream(weights).max().getAsInt())* weights.length, sum = 0, day = 0, ans = high;
        while(low <= high){
            int mid = low + (high - low)/2;
            for(int i = 0 ; i < weights.length ; i++){
                sum+=weights[i];
                if(sum > mid){
                    day++;
                    sum = 0;
                    sum+=weights[i];
                }
                if(i== weights.length -1 && sum <= mid ){
                    day++;
                }
            }
            if(day <= days){
                ans = mid;
                high = mid -1;
            }
            else{
                
                low = mid +1;
            }
            sum =0;
            day = 0;
        }
        return ans;
    }
}