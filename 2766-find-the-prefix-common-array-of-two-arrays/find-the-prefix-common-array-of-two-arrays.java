class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        int count = 0;
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i< A.length ; i++){
            map.put(A[i] , B[i]);
            if(A[i] == B[i])count++;
            else{
            if(map.containsValue(A[i])){
               count++;
            }
            if(map.containsKey(B[i])){
                count++;
            }
            }
            ans[i] = count;
        }
        return ans;
    }
}