class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 , high = Arrays.stream(piles).max().getAsInt() ,ans = 0;
        long count = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            for(int i = 0 ; i < piles.length ; i++){
                if(piles[i] % mid == 0){
                    count += (piles[i]/mid);
                }
                else{
                    count += (piles[i]/mid) + 1;
                }
            }
            
            if(count > h){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid - 1;
            }
            count = 0;
        }
        return ans;
    }
}