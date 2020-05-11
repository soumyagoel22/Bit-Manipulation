import java.util.*;

public class Solution {
    public int numSetBits(long a) {
        long rem;
        int c=0;
        while(a!=0)
        {
            rem=a%2;
            if(rem==1)
            c++;
            a=a/2;
        }
        return c;
    }
}
