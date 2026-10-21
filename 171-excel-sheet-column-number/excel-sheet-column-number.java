class Solution {
    public int titleToNumber(String columnTitle) {
        int count = columnTitle.length() , sum =0 ;
        for(int i =0 ; i < columnTitle.length() ; i++){
            int num = columnTitle.charAt(i) - 'A' + 1;
            sum += num *(Math.pow(26 , count - 1));
            count--;
        }
        return sum;

    }
}