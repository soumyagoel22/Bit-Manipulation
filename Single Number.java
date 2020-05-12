import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> a) {
    int a1,i,n;
    n=a.size();
    a1=a.get(0);
    for(i=1;i<n;i++)
    {
        a1 ^= a.get(i);
    }
    return a1;
    }
}
