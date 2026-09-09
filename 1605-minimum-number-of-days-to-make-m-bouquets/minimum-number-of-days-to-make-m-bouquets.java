class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = Arrays.stream(bloomDay).min().getAsInt() , high = Arrays.stream(bloomDay).max().getAsInt() , count = 0 , ans = 0 ,ans2 = high ;
        if( (long)m*k > bloomDay.length){
            return -1;
        }
        while(low<=high){
            int mid = low + (high - low)/2;
            for(int i = 0 ; i < bloomDay.length ; i++){
                if(i == bloomDay.length -1 && mid >= bloomDay[i]){
                    count++;
                    ans+=count/k;
                }
                else if(mid >= bloomDay[i]){
                    count++;
                }
                else {
                    ans += count/k;
                    count =0 ;
                }
            }
            
            if(ans >= m){
                ans2 = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            ans = 0;
            count = 0;
        }
        return ans2;
    }
}