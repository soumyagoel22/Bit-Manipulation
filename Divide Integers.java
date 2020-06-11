import java.util.*;

public class Solution {
    public int divide(int A, int B) {
       int count=0,sign=1;
       if(B==0 || (A==Integer.MIN_VALUE && B==-1))
       return Integer.MAX_VALUE;
       if(A==Integer.MIN_VALUE && B==1)
       return Integer.MIN_VALUE;
       long ab = A;
       if(ab<0 && B<0)
       {
           ab=-ab;
           B=-B;
       }
       else if(ab<0)
       {
           ab=-ab;
           sign=-1;
       }
       else if(B<0)
       {
           B=-B;
           sign=-1;
       }
       while(ab>=B)
       {
           ab=ab-B;
           count++;
       }
       if(sign==-1)
       return sign*count;
       else
       return count;
    }
}
