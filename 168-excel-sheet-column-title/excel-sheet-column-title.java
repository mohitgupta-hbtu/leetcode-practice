class Solution {
    public String convertToTitle(int columnNumber) {
        int num = columnNumber ;
        String ans = "";
        while(num  > 0){
            num--;
            int rem  = num % 26;
            char ch = (char)('A' + rem);
            ans = ch + ans;
            num = num/26;
        }
        return ans;
    }
}