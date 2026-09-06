class Solution {
    public int mySqrt(int x) {
        int low= 0 , high = x , ans = 0;
        while(low <= high){
            long mid = low + (high - low)/2;
            if(mid*mid == x){
                ans = (int)(mid);
                return ans;
            }
            if(mid*mid >= Integer.MAX_VALUE){
                high = (int)(mid) - 1;
            }
            else if(mid*mid > x){
                high = (int)(mid) - 1;
            }
            else{
                ans = (int)(mid);
                low = (int)(mid) + 1;
            }
        }
        return ans;
    }
}