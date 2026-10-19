class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 ) return false;
        int num = x , rem = 0 , sum = 0;
        while(x > 0){
            rem = x %10;
            sum = sum*10 + rem;
            x/= 10 ;
            
        }
        if(sum == num) return true;
        else{
            return false;
        }
    }
}