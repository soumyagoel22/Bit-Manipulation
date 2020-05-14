public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
       Collections.sort(A);
        int n=A.size();
        int minXor = Integer.MAX_VALUE;
        int val = 0;
        for (int i = 0; i < n - 1; i++) {
            val = A.get(i) ^ A.get(i+1);
            minXor = Math.min(minXor, val);
        }
 
        return minXor;
    }
}
