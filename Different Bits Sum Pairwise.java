public class Solution {
    public int cntBits(List<Integer> a) {
        int[] count1=new int[32];
        for (int n:a) {
            for (int i=0; i<32; i++) {
                count1[i]+=n & 1;
                n=n>>1;
            }
        }
        long res=0;
        for (int i=0; i<32; i++) {
            res+=((long)count1[i]*(a.size()-count1[i]))%1000000007;
        }
        return (int)(2*res%1000000007);
    }
}
